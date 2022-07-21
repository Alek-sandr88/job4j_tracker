package ru.job4j.poly;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Поезд едет по рельсам");
    }

    @Override
    public void travelTime(int time) {
        System.out.println("Время в пути " + time);
    }
}
