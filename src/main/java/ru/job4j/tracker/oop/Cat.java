package ru.job4j.tracker.oop;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println(this.food + " " + this.name);
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.eat("Котлета");
        gav.show();
        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.eat("Рыба");
        black.show();
        Cat name = new Cat();
        name.giveNick("Кузя");
        name.show();
    }
}
