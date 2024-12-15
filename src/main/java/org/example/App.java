package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.proxypattern.Calculator;
import org.example.proxypattern.CalculatorInterface;
import org.example.proxypattern.DataToday;
import org.example.proxypattern.JokeCalculator;

public class App {
    /**
     * Функция создания даты
     *
     * @param number число
     * @param mount  месяц
     * @return возвращает дату
     */
    private static String Data(Integer number, String mount) {
        return String.format("%d %s", number, mount);
    }

    private static Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        /**
         * Разобрать паттерн proxy (шутливый калькулятор) чтобы 1 апреля
         * он выдавал близкий но не правильный результат, а в остальное время работал как нужно
         */
        String data1 = Data(1, "апреля");// дата с которой необходимо сравнить чтобы работал JokeCalculator
        String data2 = Data(1, "Апреля");// дата с которой необходимо сравнить чтобы работал JokeCalculator
        DataToday dataToday = new DataToday(1, "Апреля");//Конструктор для создания сегодняшней даты
        CalculatorInterface calculator = new Calculator();
        if (dataToday.fullDataToday().equals(data1) || dataToday.fullDataToday().equals(data2)) {
            calculator = new JokeCalculator();
        }
        Double Number = calculator.addition(5.0, 6.0);
        Double Number2 = calculator.subtraction(7.0, 6.0);
        Double Number3 = calculator.multiplication(3.0, 4.0);
        Double Number4 = calculator.division(12.0, 6.0);
        logger.info(Number);
        logger.info(Number2);
        logger.info(Number3);
        logger.info(Number4);
        /**
         * Реализовать паттерн observer для изменения какого либо объекта
         */
        Wather wather = new Wather(24, 760, 3.2, 30, 0);
        wather.setCloudCover(1);
        wather.setTemperature(20);
        logger.info(wather.toString());
    }

}
