package ru.job4j.ex;

public class ElementNotFoundException extends Exception {
    public ElementNotFoundException() {
        super("Элемент не найден");
    }
}
