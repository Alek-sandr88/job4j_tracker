package ru.job4j.tracker.oop;

public class Ball {
    public boolean tryRun(boolean condition) {
        if (condition) {
            System.out.println("Колобок съеден");
        } else {
            System.out.println("Колобок сбежал");
        }
        return condition;
    }
}
