package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PayrollIntegrationTest {

    @Test
    void testCalculateNetPayIntegration() {
        // 1. Setup both components
        Calculator calc = new Calculator();
        PayrollService payroll = new PayrollService(calc);

        // 2. Execute a task that requires both to work together
        int result = payroll.calculateNetPay(5000, 1000);

        // 3. Verify the combined result
        assertEquals(4000, result, "PayrollService should correctly use Calculator to find net pay.");
    }
}
