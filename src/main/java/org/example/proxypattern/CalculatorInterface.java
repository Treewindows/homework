package org.example.proxypattern;

public interface CalculatorInterface {
    /**
     * Функция сложения двух чисел a,b
     *
     * @param a заданное пользователем число
     * @param b заданное пользователем число
     */
    Double addition(Double a, Double b);

    /**
     * Функция вычитания двух чисел a,b
     *
     * @param a заданное пользователем число
     * @param b заданное пользователем число
     */
    Double subtraction(Double a, Double b);

    /**
     * Функция умножения двух чисел a,b
     *
     * @param a заданное пользователем число
     * @param b заданное пользователем число
     */
    Double multiplication(Double a, Double b);

    /**
     * Функция деления двух чисел a,b
     *
     * @param a заданное пользователем число
     * @param b заданное пользователем число
     */
    Double division(Double a, Double b);
}
