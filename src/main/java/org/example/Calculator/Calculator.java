package org.example.Calculator;

import org.example.Exception.DivisionByZero;

public class Calculator {
    /**
     * Функция возвращает  сумму двух чисел.
     * @param value1 - значение первого числа.
     * @param value2 - значение второго числа.
     * @return - результат сложения двух чисел.
     */
    public static Double addition(Double value1, Double value2){
        return value1 + value2;
    }
    /**
     * Функция возвращает разность двух чисел.
     * @param value1 - значение первого числа.
     * @param value2 - значение второго числа.
     * @return - результат разности двух чисел.
     */
    public static  Double subtraction(Double value1, Double value2){
        return  value1 - value2;
    }
    /**
     * Функция возвращает произведение двух чисел.
     * @param value1 - значение первый множитель.
     * @param value2 - значение второй множитель.
     * @return - результат произведения двух чисел.
     */
    public static Double multiplication(Double value1, Double value2){
        return value1 * value2;
    }
    /**
     * Функция возвращает результат деления двух чисел.
     * @param value1 - делимоое.
     * @param value2 - делитель.
     * @return - частное.
     */
    public static Double division(Double value1, Double value2) throws DivisionByZero {
        if (value2 == 0){
            throw new DivisionByZero();
        }
        return  value1/value2;
    }
    /**
     * Функция возвращает результат возведения числа в квадрат.
     * @param value - число.
     * @return - значения числа в квадрате.
     */
    public static Double squaring(Double value){
        return value*value;
    }
}

