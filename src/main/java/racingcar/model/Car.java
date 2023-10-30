package racingcar.model;

public class Car {

    private final String name;
    private int location;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getLocation() {
        return location;
    }

    public boolean isLocationEqual(int maxLocation) {
        return getLocation() == maxLocation;
    }

    public int move(int forwardCount) {
        return location += forwardCount;
    }

    public String getStringLocation() {
        return "-".repeat(location);
    }
}
