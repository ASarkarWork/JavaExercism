public class Twofer {
    public String twofer(String name) {
        String givenName;
        
        if(name == null) {
            givenName = "you";
        }
        else {
            givenName = name;
        }

        return String.format("One for %s, one for me.", givenName);
    }
}
