package ru.job4j.poly;

public class TransportRides {
    public static void main(String[] args) {
        Vehicle vehicle = new Bus();
        Vehicle vehicle2 = new Train();
        Vehicle vehicle3 = new Airplane();
        Vehicle[] vehicles = new Vehicle[]{vehicle, vehicle2, vehicle3};
        for (Vehicle veh: vehicles) {
            veh.move();
            veh.travelTime(4);
        }
    }
}
