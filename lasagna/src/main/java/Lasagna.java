public class Lasagna {
    private static final int EXPECTED_MINUTES_IN_OVEN = 40; 
    private static final int LAYER_PREPARATION_FACTOR = 2;

    public int expectedMinutesInOven() {
        return EXPECTED_MINUTES_IN_OVEN;
    }
    public int remainingMinutesInOven(int currentTime) {
        return expectedMinutesInOven() - currentTime;
    }
    public int preparationTimeInMinutes(int layers) {
        return layers * LAYER_PREPARATION_FACTOR;
    }
    public int totalTimeInMinutes(int layers, int currentTime) {
        return preparationTimeInMinutes(layers) + currentTime;
    }
}
