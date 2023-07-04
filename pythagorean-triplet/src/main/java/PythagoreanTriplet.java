import java.util.ArrayList;
import java.util.Optional;

class PythagoreamTriplet {
    private int a, b, c;
    private Optional<Integer> targetSum;
    private Optional<Integer> factorLessEqual;
    private ArrayList<PythagoreamTriplet> tripletList;

    public PythagoreamTriplet(int a, int b, int c) {
        targetSum = Optional.empty(); 
        factorLessEqual = Optional.empty();
        tripletList = null;
    }
    public static PythagoreamTriplet makeTripletsList() {
        PythagoreamTriplet newTriplet = new PythagoreamTriplet(-1, -1, -1);

        return newTriplet;
    }
    public PythagoreamTriplet thatSumTo(int targetSum) {
        this.targetSum = Optional.of(targetSum);

        return this;
    }
    public PythagoreamTriplet withFactorsLessThanOrEqualTo(int factorLessEqual) {
        this.factorLessEqual = Optional.of(factorLessEqual);

        return this;
    }
    public build() {
        assert targetSum.isPresent() || factorLessEqual.isPresent();

        int finalTarget = targetSum.orElse();
        int
    }
    public boolean equals(PythagoreamTriplet other) {
        return a == other.a && b == other.b && c == other.c;
    }
}