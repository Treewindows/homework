package org.example.Math;

/**
 * Написать класс Calculator со статическими методами (сложение, вычитание, умножение, деление)
 */
public class calculator {
    /**
     * Функция сложения двух чисел a,b
     *
     * @param a заданное пользователем число
     * @param b заданное пользователем число
     * @return возвращает сумму двух чисел
     */
    public static Double addition(Double a, Double b) {
        return a + b;
    }

    /**
     * Функция вычитания двух чисел a,b
     *
     * @param a заданное пользователем число
     * @param b заданное пользователем число
     * @return возвращает разность двух чисел
     */
    public static Double subtraction(Double a, Double b) {
        return a - b;
    }

    /**
     * Функция умножения двух чисел a,b
     *
     * @param a заданное пользователем число
     * @param b заданное пользователем число
     * @return возвращает произведение двух чисел
     */
    public static Double multiplication(Double a, Double b) {
        return a * b;
    }

    /**
     * Функция деления двух чисел a,b
     *
     * @param a заданное пользователем число
     * @param b заданное пользователем число
     * @return возвращает частное двух чисел
     */
    public static Double division(Double a, Double b) {
        return a / b;
    }

    /**
     * Функция возведения числа во 2 степень
     *
     * @param a заданное пользователем число
     * @return возвращает результат возведение числа во 2 степень
     */
    public static Double squaring(Double a) {
        return a * a;
    }
}
