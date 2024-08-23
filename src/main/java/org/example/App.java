package org.example;

/**
 * Hello world!
 */
public class App {
    /**
     *Задание №1  Написать функцию, которая будет сравнивать и выводить наименьшее значение
     * из заданных целых чисел a , b , c.
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
     */
    private static Boolean leapYear(Integer year) {
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            return  true;
        } else {
            return false;
        }
    }
    /**
     * Задание №3 Вывести значение выражения (4*(x - 5)^2 + 7*x – 10)/(x^4+1)
     * */
    private static Double equation(Double x) {
        Double result = (4 * Math.pow(x - 5, 2) + (7 * x) - 10) / ((Math.pow(x, 4) + 1));
        return result;
    }
    /**
     *
     * Задание №4 Определить в какой четверти находится точка, если известны её координаты.
     *
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
     *  Задание №5 Существует ли треугольник по трем сторонам(треугольник существует когасумма двух любы сторон больше третьей)
     *
     */
    private static String triangle(Double a, Double b, Double c) {
        if (a + b > c && a + c > b && b + c > a) {
            return "Треугольник существует\n";
        } else {
            return "Треугольник существует\n";
        }
    }
    /**
     *
     *  Задание №6 Решить квадратное уравнение a*x^2 + b*x + c = 0 имея a,b,c ответ вывести в строку
     */
    private static Double[] discriminant(Double a, Double b, Double c) {
        Double [] array = new Double[2];
        Double D = ((Math.pow(b, 2)) - (4 * a * c));
        if (D > 0) {
            Double x1 = (-(b) + (Math.sqrt(D))) / (2 * a);
            Double x2 = (-(b) - (Math.sqrt(D))) / (2 * a);
            array [0] = x1;
            array [1] = x2;

            //System.out.print(String.format("Первый корень уравнения %s\n",x1));
            //System.out.print(String.format("Второй корень уравнения %s\n",x2));
        } else if (D < 0) {
            System.out.println("Нет действительных корней");
            array [0] = null;
            array [1] = null;
        } else  {
            Double x = (-(b)) / (2 * a);
            array [0] =x;
            array [1] = null;
            //System.out.print(String.format("Корень уравнения %s\n",x));

        }
        return array;
    }
    public static void main(String[] args) {
        // Задание №1
        Integer z = minNumbers(5, 7, 3);
        System.out.print("Наименьшее число: "  + z + "\n" );
        // Задание №2
        Integer year = 2400;
        Boolean w = leapYear(year);
        System.out.print("Является ли год" + " " + year + " вискосным " + w + "\n");
        // Задание №3
        Double f = equation(3.0);
        System.out.print(String.format("Значение функции %.3f\n", f));
        // Задание №4
        String r =  quarter(3.2, 4.1);
       System.out.print(r);
        // Задание №5
        String q =  triangle(4.0, 5.0, 6.0);
        System.out.print(q);
        // Задание №6
        Double [] discriminant = discriminant(16.0, -40.0, -25.0);
        System.out.print("Корень квадратного уравнения равен: ");
        for (Integer i = 0; i < discriminant.length;i++){
            System.out.printf("%.2f", discriminant[i]);
        }
    }
}