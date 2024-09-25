package org.example;

import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    /**
     * Задание №1
     * Написать функцию которая принимает 3 значения
     * (длина массива(length), минимально-возможное значение элемента(minValue), максимально-возможное значение элемента массива(maxValue))
     * и генерирует массив заданной длины, заполняя его числами в промежутке между [maxValue, minValue]
     *
     * @param length   длина массива.
     * @param maxValue максимальное значение массива.
     * @param minValue минимальное значение массива.
     * @return возвращает рандомно сгенерированый массив
     */
    private static Integer[] generateArray(Integer length, Integer maxValue, Integer minValue) {
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
     *
     * @param array рандомно сгенерированый массив
     * @return возвращает результат суммирования всех элементов массива
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
     *
     * @param array рандомно сгенерированый массив
     * @return возвращает массив заполненный четными элементыми
     */
    private static Integer[] evenNumbersArray(Integer[] array) {
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
     *
     * @param array рандомно сгенерированый массив
     * @return возвращает обратный массив принимаемому функцией
     */
    private static Integer[] reverseArray(Integer[] array) {
        Integer[] reverse = new Integer[array.length];
        for (Integer i = 0; i < array.length; i++) {
            reverse[array.length - 1 - i] = array[i];
        }
        return reverse;
    }

    /**
     * Задание №5
     * “Удалить” элемент из массива по индексу
     *
     * @param array рандомно сгенерированый массив
     * @param index индекс элемента массива который необходимо удалить
     * @return возвращает массив без элеметна массива
     */
    private static Integer[] deleteElementbyIndex(Integer[] array, Integer index) {
        Integer[] deleteElementbyIndex = new Integer[array.length - 1];
        for (Integer i = 0; i < index; i++) {
            deleteElementbyIndex[i] = array[i];
        }
        for (Integer i = index; i < array.length - 1; i++) {
            deleteElementbyIndex[i] = array[i + 1];
        }
        return deleteElementbyIndex;
    }

    /**
     * Задание №6
     * Отсортировать массив с помощью пузырька (Bubble sort, сортировка пузырьком)
     *
     * @param array рандомно сгенерированый массив
     * @return отсортированный массив пузырьковым методом
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
     *
     * @param k указанное пользователем число
     * @return возвращает результат является ли кратным числу k сумма ряда чисел
     */
    private static Boolean numberK(Integer k) {
        Boolean multiple = false;
        Integer sum = 0;
        Integer[] array = new Integer[]{1, 2, 3, 4};
        for (Integer i = 0; i < array.length; i++) {
            sum += array[i];
            if (sum % k == 0) {
                multiple = true;
            }
        }
        return multiple;
    }

    /**
     * Функция для вывода массива в консоль.
     *
     * @param array массив пользователя, который необходимо вывести в консоль.
     */
    private static void printArray(Integer[] array) {
        logger.info("{ ");
        for (Integer i = 0; i < array.length; i++) {
            logger.info(array[i] + " ");
        }
        logger.info("}");
    }

    public static void main(String[] args) {
        /**
         * Задание Пятого урока №1 Заменить все System.out на логгер в предыдущих заданиях
         * Задание Пятого урока №3 Сделать вывод лога в файл
         */

        // Функция для задания № 1
        Integer[] array = generateArray(5, 1, -10);
        logger.info("Рандочно сгенерированный массив");
        printArray(array);
        // Функция для задания № 2
        Integer sumElement = sumArray(array);
        logger.info("Сумма всех элементов массива = {}", sumElement);
        //System.out.print(String.format("\nСумма всех элементов массива = %s", sumElement));
        // Функция для задания № 3
        Integer[] evenElement = evenNumbersArray(array);
        logger.info("\nЧетные элементы массива: ");
        printArray(evenElement);
        // Функция для задания № 4
        Integer[] reverseElement = reverseArray(array);
        logger.info("\nОбратный массив: ");
        printArray(reverseElement);
        // Функция для задания № 5
        Integer[] deleteByIndex = deleteElementbyIndex(array, 2);
        logger.info("\nУдаление массива по индексу элемента в массиве: ");
        printArray(deleteByIndex);
        // Функция для задания № 6
        Integer[] sortingArray = bubbleSort(array);
        logger.info("\nПузырьковый метод: ");
        printArray(sortingArray);
        // Функция для задания № 7
        Boolean z = numberK(2);
        logger.info("\nЗначение есть ли число кратное сумме ряда чисел = " + z);
    }
}