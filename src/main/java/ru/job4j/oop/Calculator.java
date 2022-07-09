package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return x - y;
    }

    public int divide(int y) {
        return x / y;
    }

    public int sumAllOperation(int y) {
        y = sum(y) + minus(y) + divide(y);
        return y;
    }

    public static void main(String[] args) {
        sum(5);
        minus(5);
        Calculator calculator = new Calculator();
        calculator.divide(5);
        calculator.sumAllOperation(5);
    }
}
