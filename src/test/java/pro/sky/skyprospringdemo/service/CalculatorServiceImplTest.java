package pro.sky.skyprospringdemo.service;

import org.junit.jupiter.api.Test;
import pro.sky.skyprospringdemo.exception.DivideException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    private CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    private int num1 = 5;
    private int num2 = 2;

    @Test
    void plus_shouldReturnPositiveNumberWhenNum1AndNum2ArePositive() {
        long result = calculatorService.plus(num1, num2);

        assertEquals(num1 + num2, result);
    }

    @Test
    void plus_shouldReturnNegativeNumWhenNum1IsPositiveAndNum2IsNegativeAndNum2BiggerThenNum1() {
        num2 = -6;

        long result = calculatorService.plus(num1, num2);

        assertEquals(num1 + num2, result);
    }

    @Test
    void divide_shouldReturnPositiveNumberWhenNum1AndNum2ArePositive() {
        double result = calculatorService.divide(num1, num2);

        assertEquals((double) num1/num2, result);
    }

    @Test
    void divide_shouldReturnNegativeNumWhenNum1IsPositiveAndNum2IsNegativeAndNum2BiggerThenNum1() {
        num2 = -5;

        double result = calculatorService.divide(num1, num2);

        assertEquals((double) num1/num2, result);
    }

    @Test
    void divide_shouldThrowExceptionWhenNum2Is0() {
        num2 = 0;

        DivideException result = assertThrows(DivideException.class,
                () -> calculatorService.divide(num1, num2));
        assertEquals("Деление на 0 не доступно", result.getMessage());
    }

    @Test
    void minus_shouldReturnPositiveNumberWhenNum1AndNum2ArePositive() {
        long result = calculatorService.minus(num1, num2);

        assertEquals(num1 - num2, result);
    }

    @Test
    void minus_shouldReturnNegativeNumberWhenNum1AndNum2ArePositive() {
        num2 = 10;

        long result = calculatorService.minus(num1, num2);

        assertEquals(num1 - num2, result);
    }

    @Test
    void multiply_shouldReturnPositiveNumberWhenNum1AndNum2ArePositive() {
        long result = calculatorService.multiply(num1, num2);

        assertEquals(num1 * num2, result);
    }

    @Test
    void multiply_shouldReturnNegativeNumberWhenNum1IsPositiveAndNum2IsNegative() {
        num2 = -3;

        long result = calculatorService.multiply(num1, num2);

        assertEquals(num1 * num2, result);
    }
}