package ru.job4j.poly;

public class Bus implements Transport, Vehicle {
    @Override
    public void drive() {
        System.out.println("Автобус начал движение");
    }

    @Override
    public void passengers(int amount) {
        System.out.println("Количество пасажиров " + amount);
    }

    @Override
    public int refuel(int amount, int prices) {
        return prices * amount;
    }

    @Override
    public void move() {
        System.out.println("Автобус едет по дороге");
    }

    @Override
    public void travelTime(int time) {
        System.out.println("Время в пути " + time);
    }
}
