package pro.sky.skyprospringdemo.service;

import org.springframework.stereotype.Service;
import pro.sky.skyprospringdemo.exception.DivideException;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public long plus(int num1, int num2) {
        return (long) num1 + num2;
    }

    @Override
    public double divide(int num1, int num2) {
        if (num2 == 0) {
            throw new DivideException("Деление на 0 не доступно");
        }
        return (double) num1 / num2;
    }

    @Override
    public long multiply(int num1, int num2) {
        return (long) num1 * num2;
    }

    @Override
    public long minus(int num1, int num2) {
        return (long) num1 - num2;
    }


}
