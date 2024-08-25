package org.example;

import java.util.Random;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

/**
 * Hello world!
 */
public class App {
    /**
     * Задание №1
     * Написать функцию которая принимает 3 значения
     * (длина массива(length), минимально-возможное значение элемента(minValue), максимально-возможное значение элемента массива(maxValue))
     * и генерирует массив заданной длины, заполняя его числами в промежутке между [maxValue, minValue]
     *
     * @param length   длина массива.
     * @param maxValue максимальное значение массива.
     * @param minValue минимальное значение массива.
     * @return
     */
    private static Integer[] funcArray(Integer length, Integer maxValue, Integer minValue) {
        Random ran = new Random();
        Integer[] array = new Integer[length];
        for (Integer i = 0; i < array.length; i++) {
            array[i] = ((ran.nextInt(1000) * ((maxValue - minValue) + 1)) / 1000) + minValue;
        }
        return array;
    }

    /**
     * Задание №2
     * Найти сумму всех элементов массива
     */
    private static Integer sumArray(Integer[] array) {
        Integer result = 0;
        for (Integer i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    /**
     * Задание №3
     * Вывести все четные элементы массива
     */
    private static Integer[] evennumbersArray(Integer[] array) {
        Integer[] evenNum = new Integer[array.length];
        for (Integer i = 0; i < array.length; i++) {
            if (array[i] % 2.00 == 0) {
                evenNum[i] = array[i];
            }
        }
        return evenNum;
    }

    /**
     * Задание №4
     * Вывести массив наоборот
     */
    private static Integer[] reverseArray(Integer[] array) {
        Integer[] reverse = new Integer[array.length];
        for (Integer i = array.length - 1; i >= 0; i--) {
            reverse[i] = array[i];
        }
        return reverse;
    }

    /**
     * Задание №5
     * <p>
     * “Удалить” элемент из массива по индексу
     */
    private static Integer[] deleteElementbyIndex(Integer[] array, Integer number) {
        Integer[] deleteElementbyIndex = new Integer[array.length - 1];
        for (Integer i = 0; i < number; i++) {
            deleteElementbyIndex[i] = array[i];
        }
        for (Integer i = number; i < array.length - 1; i++) {
            deleteElementbyIndex[i] = array[i + 1];
        }
        return deleteElementbyIndex;
    }

    /**
     * Задание №6
     * Отсортировать массив с помощью пузырька (Bubble sort, сортировка пузырьком)
     */
    private static Integer[] bubbleSort(Integer[] array) {
        Boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (Integer i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    Integer swap = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = swap;
                    sorted = false;
                }
            }
        }
        return array;
    }

    /**
     * Задание №7
     * У нас есть последовательность 1+2+3+…+n определить существует ли такое n чтобы сумма ряда была кратно числу k, написать функцию в которую передают только число k, и получают true либо false
     */
    private static Boolean numberK(Integer k) {
        Boolean kratnoe = false;
        Integer sum = 0;
        Integer[] array = new Integer[]{1, 2, 3, 4};
        for (Integer i = 0; i < array.length; i++) {
            sum += array[i];
            if (sum % k == 0) {
                kratnoe = true;
            }
        }
        return kratnoe;
    }

    public static void main(String[] args) {
        // Функция для задания № 1
        Integer[] array = funcArray(5, 1, -10);
        System.out.print("Рандомно сгененрированный массив { ");
        for (Integer i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.print("}");
        // Функция для задания № 2
        Integer sumElement = sumArray(array);
        System.out.print(String.format("\nСумма всех элементов массива = %s", sumElement));
        // Функция для задания № 3
        Integer[] evenElement = evennumbersArray(array);
        System.out.print("\nЧетные элементы массива: ");
        for (Integer i = 0; i < evenElement.length; i++) {
            System.out.print(evenElement[i] + " ");
        }
        // Функция для задания № 4
        Integer[] reverseElement = reverseArray(array);
        System.out.print("\nОбратный массив {");
        for (Integer i = reverseElement.length - 1; i >= 0; i--) {
            System.out.print(reverseElement[i] + " ");
        }
        System.out.print("}");

        // Функция для задания № 5
        Integer[] deleteByIndex = deleteElementbyIndex(array, 2);
        System.out.print("\nУдаление массива по индексу элемента в массиве { ");
        for (Integer i = 0; i < deleteByIndex.length; i++) {
            System.out.printf(deleteByIndex[i] + " ");
        }
        System.out.print("}");
        // Функция для задания № 6
        Integer[] sortirovka = bubbleSort(array);
        System.out.print(String.format("\nПузырьковый метод: { "));
        for (Integer i = 0; i < array.length; i++) {
            System.out.print(sortirovka[i] + " ");
        }
        System.out.print("}");
        // Функция для задания № 7
        Boolean z = numberK(2);
        System.out.printf("\nЗначение есть ли число кратное сумме ряда чисел = " + z);
    }
}