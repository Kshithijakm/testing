package com.example;

public class PayrollService {
    private Calculator calculator;

    public PayrollService(Calculator calculator) {
        this.calculator = calculator;
    }

    public int calculateNetPay(int grossSalary, int taxAmount) {
        // This is the "Integration" point: PayrollService calls Calculator
        return calculator.subtract(grossSalary, taxAmount);
    }
}
