package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return y + x;
    }

    public static int multiply(int y) {
        return y * x;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);

    }

    public static void main(String[] args) {
        sum(5);
        minus(5);
        multiply(5);
        Calculator calculator = new Calculator();
        calculator.divide(5);
        calculator.sumAllOperation(5);
    }
}
