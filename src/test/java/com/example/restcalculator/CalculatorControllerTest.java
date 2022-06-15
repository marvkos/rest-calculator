package com.example.restcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorControllerTest {

    CalculatorController calculatorController = new CalculatorController();

    @Test
    void testSum() {
        int a = 5;
        int b = 9;

        int expected = 14;

        int result = calculatorController.sum(a, b);

        assertEquals(expected, result);
    }

}