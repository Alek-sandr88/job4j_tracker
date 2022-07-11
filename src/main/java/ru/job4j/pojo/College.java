package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Иванов Сергей Сергеевич");
        student.setGroup(201);
        student.setReceiptDate(2020);
        System.out.println("Студент " + student.getSurname());
        System.out.println("учиться в группе " + student.getGroup());
        System.out.println("поступил в " + student.getReceiptDate());
    }
}
