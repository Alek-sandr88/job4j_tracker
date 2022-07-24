package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                rsl = i;
            } else {
                throw new ElementNotFoundException();
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] array = {"X", "Y", "Z", "F", "A"};
        try {
            System.out.println(indexOf(array, "A"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
