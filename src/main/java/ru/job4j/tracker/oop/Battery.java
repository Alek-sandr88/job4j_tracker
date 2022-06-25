package ru.job4j.tracker.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void exchange(Battery another) {
        this.load = getLoad() - another.load;
    }

    public static void main(String[] args) {
        Battery battery = new Battery(10);
        battery.exchange(battery);
    }
}
