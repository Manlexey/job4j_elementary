package ru.job4j.Calculator;

import org.junit.Test;
import org.junit.Assert;

public class FitTest {

    @Test
    public void whenmanWeight92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
        }

    @Test
    public void womanWeight() {
        short in = 165;
        double expected = 63.25;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}