package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[this.items.length];
        int size = 0;
        Item item = new Item();
        for (int i = 0; i < this.items.length; i++) {
            if (item.getName() != null && key.equals(item.getName())) {
                if (key.equals(item.getName())) {
                    rsl[size] = this.items[i];
                    size++;
                }
                items = Arrays.copyOf(rsl, size);
            }
        }
        return items;
    }

    public Item[] findAll() {
        return items;
    }
}



