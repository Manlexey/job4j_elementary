package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void distance() {
        int x1;
        int x2;
        int y1;
        int y2;
        double expected = 2.828;
        double out = Point.distance(1, 2, 3, 4);
        Assert.assertEquals(expected, out, 0.1) ;

    }


}