package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void max() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void maxFirst() {
        int result = Max.max(20, 10);
        assertThat(result, is(20));
    }

    @Test
    public void Rovno() {
        int result = Max.max(20, 20);
        assertThat(result, is(20));
    }
}