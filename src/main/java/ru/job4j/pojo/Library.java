package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book novel = new Book("Роман", 5);
        Book fairyTales = new Book("Сказки", 7);
        Book detective = new Book("Детектив", 2);
        Book cleanCode = new Book("Clean code", 8);
        Book[] books = new Book[4];
        books[0] = novel;
        books[1] = fairyTales;
        books[2] = detective;
        books[3] = cleanCode;
        for (Book bk : books) {
            System.out.println(bk.getName() + " " + bk.getAmount());
        }
        Book temp = books[3];
        books[3] = books[0];
        books[0] = temp;
        for (Book bk : books) {
            System.out.println(bk.getName() + " " + bk.getAmount());
        }
        for (Book bk : books) {
            if ("Clean code".equals(bk.getName())) {
                System.out.println(bk.getName());
            }
        }
    }
}
