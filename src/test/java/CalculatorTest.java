package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(10, calc.add(5, 5), "5 + 5 should equal 10");
    }

    @Test
    void testSubtraction() {
        Calculator calc = new Calculator();
        assertEquals(4, calc.subtract(10, 6), "10 - 6 should equal 4");
    }
}
