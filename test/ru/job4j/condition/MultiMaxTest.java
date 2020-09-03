package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
public class MultiMaxTest {

    @Test
    public void max() {
        int result = MultiMax.max(3, 3, 3);
        assertThat(result, is(4));
    }
}
