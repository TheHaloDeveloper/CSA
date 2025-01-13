public class Car {
    private int last_oil_change = 0;
    private int miles_driven;
    private int change_duration;

    public Car(int driven, int oil_num) {
        miles_driven = driven;
        change_duration = oil_num;
    }

    public boolean timeForOilChange() {
        boolean result = (miles_driven - last_oil_change) >= change_duration;
        if (result) {
            last_oil_change = miles_driven;
        }
        return result;
    }

    public void addMiles(int miles) {
        miles_driven += miles;
    }
}
