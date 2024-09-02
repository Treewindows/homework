package org.example;

import javax.swing.undo.AbstractUndoableEdit;

/**
 * Hello world!
 */
public class App {
    /**
     * Задание №1  Написать функцию, которая будет сравнивать и выводить наименьшее значение
     * из заданных целых чисел a , b , c.
     *
     * @param a указанное пользователем число
     * @param b указанное пользователем число
     * @param c указанное пользователем число
     * @return возвращает наибольшее число из заданных
     */
    private static Integer minNumbers(Integer a, Integer b, Integer c) {
        if (a < c && a < b) {
            return a;
        } else if (b < c) {
            return b;
        } else {
            return c;
        }
    }

    /**
     * Задание №2 Определить, является ли год високосным. (
     * год является високосным, если его номер кратен 4,
     * но не кратен 100, а также если он кратен 400  )
     *
     * @param year заданный год пользователем
     * @return возвращает является ли год високосным
     */
    private static Boolean leapYear(Integer year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Задание №3 Вывести значение выражения (4*(x - 5)^2 + 7*x – 10)/(x^4+1)
     *
     * @param x указанное пользователем число
     * @return возвращает результат решения уравнения
     */
    private static Double equation(Double x) {
        Double result = (4 * Math.pow(x - 5, 2) + (7 * x) - 10) / ((Math.pow(x, 4) + 1));
        return result;
    }

    /**
     * Задание №4 Определить в какой четверти находится точка, если известны её координаты.
     *
     * @param x координата точки
     * @param y координата точки
     * @return возвращает четверть в которой находится точка
     */
    private static String quarter(Double x, Double y) {
        if (x > 0 && y > 0) {
            return "Точка находится в четверти №1\n";
        } else if (x < 0 && y > 0) {
            return "Точка находится в четверти №2\n";
        } else if (x > 0 && y < 0) {
            return "Точка находится в четверти №3\n";
        } else {
            return "Точка находится в четверти №4\n";
        }
    }

    /**
     * Задание №5 Существует ли треугольник по трем сторонам(треугольник существует когасумма двух любы сторон больше третьей)
     *
     * @param a сторона треугольника
     * @param b сторона треугольника
     * @param c сторона треугольника
     * @return возвращает существует ли треугольник или нет
     */
    private static String triangle(Double a, Double b, Double c) {
        if (a + b > c && a + c > b && b + c > a) {
            return "Треугольник существует\n";
        } else {
            return "Треугольник существует\n";
        }
    }

    /**
     * Задание №6 Решить квадратное уравнение a*x^2 + b*x + c = 0 имея a,b,c ответ вывести в строку
     */
    private static String discriminant(Double a, Double b, Double c) {
        Double D = ((Math.pow(b, 2)) - (4 * a * c));
        if (D > 0) {
            Double x1 = (-(b) + (Math.sqrt(D))) / (2 * a);
            Double x2 = (-(b) - (Math.sqrt(D))) / (2 * a);
            String resultx1 = String.format("%.2f", x1);
            String resultx2 = String.format("%.2f", x2);
            return String.format("Первый корень уравнения: %s\nВторой корень уравнения: %s\n", resultx1, resultx2);
        } else if (D < 0) {
            return String.format("Нет корней\n");

        } else {
            Double x = (-(b)) / (2 * a);
            String resultx = String.format("%.2f", x);
            return String.format("Корень уравнения равен: %s\n", resultx);
        }
    }

    public static void main(String[] args) {
        // Задание №1
        Integer minNumbers = minNumbers(5, 7, 3);
        System.out.print("Наименьшее число " + minNumbers + "\n");
        // Задание №2
        Boolean year = leapYear(2400);
        System.out.print("Является ли год" + " " + year + "вискосным" + year + "\n");
        // Задание №3
        Double equation = equation(3.0);
        System.out.print(String.format("Значение функции %.3f\n", equation));
        // Задание №4
        String quarter = quarter(3.2, 4.1);
        System.out.print(quarter);
        // Задание №5
        String triangle = triangle(4.0, 5.0, 6.0);
        System.out.print(triangle);
        // Задание №6
        String discriminant = discriminant(16.0, -40.0, -25.0);
        System.out.print(discriminant);
    }
}