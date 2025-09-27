public class Lasagna {

    // 1. Expected oven time in minutes
    public int expectedMinutesInOven() {
        return 40;
    }

    // 2. Remaining oven time in minutes
    public int remainingMinutesInOven(int actualMinutesInOven) {
        return expectedMinutesInOven() - actualMinutesInOven;
    }

    // 3. Preparation time in minutes
    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    // 4. Total working time in minutes
    public int totalTimeInMinutes(int layers, int actualMinutesInOven) {
        return preparationTimeInMinutes(layers) + actualMinutesInOven;
    }
}
