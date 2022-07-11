package ru.job4j.pojo;

public class Book {
    private String name;
    private int amount;

    public Book(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }
}
