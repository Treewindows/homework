package org.example.proxypattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.App;

public class Calculator implements CalculatorInterface {
    /**
     * Функция сложения двух чисел a,b
     *
     * @param a заданное пользователем число
     * @param b заданное пользователем число
     * @return возвращает сумму двух чисел
     */
    private static Logger logger = LogManager.getLogger(Calculator.class);

    public Double addition(Double a, Double b) {
        return (a + b);
    }

    /**
     * Функция вычитания двух чисел a,b
     *
     * @param a заданное пользователем число
     * @param b заданное пользователем число
     * @return возвращает разность двух чисел
     */
    public Double subtraction(Double a, Double b) {
        return a - b;
    }

    /**
     * Функция умножения двух чисел a,b
     *
     * @param a заданное пользователем число
     * @param b заданное пользователем число
     * @return возвращает произведение двух чисел
     */
    public Double multiplication(Double a, Double b) {
        return a * b;
    }

    /**
     * Функция деления двух чисел a,b
     *
     * @param a заданное пользователем число
     * @param b заданное пользователем число
     * @return возвращает частное двух чисел
     */
    public Double division(Double a, Double b) {
        return a / b;
    }
}
