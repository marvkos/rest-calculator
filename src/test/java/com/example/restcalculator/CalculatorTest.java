package com.example.restcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void sumTest1() {
        // Arrange
        int a = 5;
        int b = 6;

        int expected = 12;

        // Act
        int result = calculator.sum(a, b);

        // Assert
        assertEquals(expected, result);
    }

    @Test
    void divTest() {
        int a = 10;
        int b = 5;

        int expected = 2;

        int result = calculator.div(a, b);

        assertEquals(expected, result);
    }

    @Test
    void divTestDividedZero() {
        int a = 10;
        int b = 0;

        assertThrows(ArithmeticException.class, () -> {
            calculator.div(a, b);
        });
    }

    @Test
    void sqrTest() {
        int a = 10;

        int expected = 100;

        int result = calculator.sqr(a);

        assertEquals(expected, result);
    }
    @Test
    void pwrTest() {
        int a = 10;
        int b = 3;

        int expected = 1000;

        int result = calculator.pwr(a, b);

        assertEquals(expected, result);
    }

    @Test
    void absTest() {
        int a = -10;

        int expected = 10;

        int result = calculator.abs(a);

        assertEquals(expected, result);
    }


}