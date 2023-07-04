import java.util.NoSuchElementException;
import java.lang.reflect.Array;

class Node<T> {
    T value;
    Node<T> prev;
    Node<T> next;

    public Node(T value) {
        this.value = value;
        prev = null;
        next = null;
    }
}
class SimpleLinkedList<T> {
    private Node<T> first, last;
    private int len;
    
    SimpleLinkedList() {
        first = null;
        last = null;
        len = 0;
    }

    SimpleLinkedList(T[] values) {
        for(T value: values) {
            push(value);
        }
    }

    private boolean isEmpty() {
        return first == null;
    }
    void push(T value) {
        Node<T> newNode = new Node(value); 
        
        len++;
        if(isEmpty()) {
            first = newNode;
            last = newNode;
            return;
        }

        last.next = newNode;
        newNode.prev = last;

        last = newNode;
    }

    T pop() {
        if(isEmpty()) {
            throw new NoSuchElementException();
        }

        len--;
        if(first == last) {
            Node<T> popped = first;
            first = last = null;
            return popped.value;
        }
        
        Node<T> newLast = last.prev;
        newLast.next = null;

        Node<T> removed = last;
        last = newLast;

        removed.prev = null;
        return removed.value;
    }

    void reverse() {
        Node<T> prev = null;
        Node<T> current = first;
        
        while(current != null) {
            Node<T> next = current.next;
            
            current.next = prev;

            current.next = prev;
            current.prev = next;

            prev = current;
            current = next;
        }

        last = first;
        first = prev;
    }

    T[] asArray(Class<T> clazz) {
        T[] arr = (T[]) Array.newInstance(clazz, len);

        Node<T> current = last;
        for(int i = 0; i < len; i++) {
            arr[i] = current.value;
            current = current.prev;
        }

        return arr;
    }

    int size() {
        return len;
    }
}
