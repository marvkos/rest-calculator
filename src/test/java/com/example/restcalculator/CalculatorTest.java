package com.example.restcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void sumTest1() {
        // Arrange
        int a = 2;
        int b = 5;

        int expectedResult = 7;

        // Act
        int result = calculator.sum(a, b);

        // Assert
        assertEquals(expectedResult, result);
    }

    @Test
    void sumTest2() {
        int a = 2;
        int b = -5;

        int expectedResult = -2;

        int result = calculator.sum(a, b);

        assertEquals(expectedResult, result);
    }

    @Test
    void divTest() {
        int a = 10;
        int b = 5;

        int expectedResult = 2;

        int result = calculator.div(a, b);

        assertEquals(expectedResult, result);
    }

    @Test
    void divTestDivideZero() {
        int a = 10;
        int b = 0;

        assertThrows(ArithmeticException.class, () -> {
            calculator.div(a, b);
        });
    }

    @Test
    void sqrTest() {
        int a = 10;

        int expectedResult = 100;

        int result = calculator.sqr(a);

        assertEquals(expectedResult, result);
    }

    @Test
    void pwrTest() {
        int a = 10;
        int b = 3;

        int expectedResult = 1000;

        int result = calculator.pwr(a, b);

        assertEquals(expectedResult, result);
    }

    @Test
    void absTest() {
        int a = -10;

        int expectedResult = 10;

        int result = calculator.abs(a);

        assertEquals(expectedResult, result);
    }

}