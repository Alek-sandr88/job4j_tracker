package ru.job4j.tracker.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public void swoInfo() {
        System.out.println(this.active + " " + this.message + " " + this.status);
    }

    public static void main(String[] args) {
        Error error = new Error();
        Error error1 = new Error(true, 1, "Объект1");
        Error error2 = new Error(false, 2, "Объект2");
        Error error3 = new Error(true, 3, "Объект3");
        error.swoInfo();
        error1.swoInfo();
        error2.swoInfo();
        error3.swoInfo();
    }
}
