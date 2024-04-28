package org.avasylchuk.simpleproject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {
    @Test
    void add() {
        assertEquals(5, SimpleCalculator.add(2, 3));
        assertEquals(-1, SimpleCalculator.add(-2, 1));
        assertEquals(0, SimpleCalculator.add(0, 0));
    }

    @Test
    void subtract() {
        assertEquals(1, SimpleCalculator.subtract(4, 3));
        assertEquals(-5, SimpleCalculator.subtract(-2, 3));
        assertEquals(0, SimpleCalculator.subtract(0, 0));
    }

    @Test
    void multiply() {
        assertEquals(6, SimpleCalculator.multiply(2, 3));
        assertEquals(-6, SimpleCalculator.multiply(-2, 3));
        assertEquals(0, SimpleCalculator.multiply(0, 0));
    }

    @Test
    void divide() {
        assertEquals(2.5, SimpleCalculator.divide(5, 2));
        assertEquals(-1, SimpleCalculator.divide(-5, 5));
    }

}
