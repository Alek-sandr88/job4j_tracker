package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {

    @Test
    public void whenMax8ToThen8() {
        int a = 5;
        int b = 8;
        int c = 2;
        int result = Max.max(a, b, c);
        int expected = 8;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenMax11ToThen11() {
        int a = 3;
        int b = 5;
        int c = 11;
        int d = 1;
        int result = Max.max(a, b, c, d);
        int expected = 11;
        Assert.assertEquals(expected, result);
    }
}