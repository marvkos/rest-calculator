package com.example.restcalculator;

public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int div(int a, int b) {
        if (0 == b) {
            throw new ArithmeticException();
        }

        return a / b;
    }

    public int sqr(int a) {
        return (int) Math.pow(a, 2);
    }

    public int pwr(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public int abs(int a) {
        return Math.abs(a);
    }
}
