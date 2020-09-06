package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class Counter2Test {

        @Test
        public void whenSumEvenNumbersFromZeroToTenThenThirty() {
            int rsl = Counter2.sumByEven(0, 10);
            int expected = 30;
            assertThat(rsl, is(expected));
        }

    @Test
    public void whenSumEvenNumbersFromThreeToEightThenThirty() {
        int rsl = Counter2.sumByEven(3, 8);
        int expected = 18;
        assertThat(rsl, is(expected));
     }
    }
