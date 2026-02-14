package com.example;

public class Calculator {

    // Adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Subtracts b from a
    public int subtract(int a, int b) {
        return a - b;
    }

    // Divides a by b with a check for zero
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed!");
        }
        return (double) a / b;
    }
}
