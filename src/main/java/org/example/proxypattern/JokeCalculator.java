package org.example.proxypattern;

public class JokeCalculator implements CalculatorInterface {
    /**
     * Функция сложения двух чисел a,b
     *
     * @param a заданное пользователем число
     * @param b заданное пользователем число
     * @return возвращает сумму двух чисел
     */
    @Override
    public Double addition(Double a, Double b) {
        return ((a + b) + 0.22);
    }

    /**
     * Функция вычитания двух чисел a,b
     *
     * @param a заданное пользователем число
     * @param b заданное пользователем число
     * @return возвращает разность двух чисел
     */
    @Override
    public Double subtraction(Double a, Double b) {
        return ((a - b) + 0.22);
    }

    /**
     * Функция умножения двух чисел a,b
     *
     * @param a заданное пользователем число
     * @param b заданное пользователем число
     * @return возвращает произведение двух чисел
     */
    @Override
    public Double multiplication(Double a, Double b) {
        return ((a * b) + 0.22);
    }

    /**
     * Функция деления двух чисел a,b
     *
     * @param a заданное пользователем число
     * @param b заданное пользователем число
     * @return возвращает частное двух чисел
     */
    @Override
    public Double division(Double a, Double b) {
        return ((a / b) + 0.22);
    }
}
