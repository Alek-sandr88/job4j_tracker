package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Создать новый элемент ===");
                System.out.println("Введите имя: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Добавленная заявка: " + item);
            } else if (select == 1) {
                System.out.println("=== Показать все элементы ===");
                Item[] items = tracker.findAll();
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Хранилище еще не содержит заявок");
                }
            } else if (select == 2) {
                System.out.println("=== Изменить элемент ===");
                System.out.print("Введите идентификатор: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.print("Введите имя: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Заявка изменена успешно.");
                } else {
                    System.out.println("Ошибка замены заявки.");
                }
            } else if (select == 3) {
                System.out.println("=== Удалить пункт ===");
                System.out.print("Введите идентификатор: ");
                int id = Integer.parseInt(scanner.nextLine());
                if (tracker.delete(id)) {
                    System.out.println("Заявка удалена успешно.");
                } else {
                    System.out.println("Ошибка удаления заявки.");
                }
            } else if (select == 4) {
                System.out.println("=== Найти элемент по идентификатору ===");
                System.out.print("Введите идентификатор: ");
                int id = Integer.parseInt(scanner.nextLine());
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("Заявка с введенным id: " + id + " не найдена.");
                }
            } else if (select == 5) {
                System.out.println("=== Поиск по названию ===");
                System.out.print("Введите имя: ");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                } else {
                    System.out.println("Заявки с именем: " + name + " не найдены.");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }


    private void showMenu() {
        String[] menu = {
                "Добавить новый элемент", "Показать все элементы", "Изменить элемент",
                "Удалить пункт", "Найти элемент по идентификатору", "Поиск по названию",
                "Выход из программы"
        };
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }

    public static void main(String[] args) {
        Item item = new Item();
        System.out.println(item);
        System.out.println(item.getCreated().format(DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss")));
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
