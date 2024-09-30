package org.example;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Person.Person;
import org.example.Math.calculator;

/**
 * Hello world!
 */
public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        Person human = new Person("Дмитрий", "Денисов", "Юрьевич", 29, 1, 1970);
        Person human2 = new Person("Валерия", "Егорова", "Юрьевна", 23, 9, 1982);
        logger.info(human.toString());
        logger.info(human2.toString());
        logger.info("Результат сложения: {}", calculator.addition(2.2, 2.3));
        logger.info("Результат деления: {}", calculator.division(2.2, 2.3));
        logger.info("Результат умножения: {}", calculator.multiplication(2.2, 2.3));
        logger.info("Результат вычитания: {}", calculator.subtraction(2.2, 2.3));
        logger.info("Результат возведения числа в квадрат: {}", calculator.squaring(2.2));
    }

}