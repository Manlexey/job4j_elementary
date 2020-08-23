package ru.job4j.calculate;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class X2Test {

    @Test
    public void whenBCZero() {
        int a = 10;
        int b = 0;
        int c = 0;
        int x = 2;
        int expected = 40;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl, is(expected));
            }

    @Test
    public void whenBCOne() {
        int a = 10;
        int b = 1;
        int c = 1;
        int x = 2;
        int expected = 43;
        int rsl = X2.calc(a, b, c, x);
        assertThat(rsl, is(expected));
    }

    }