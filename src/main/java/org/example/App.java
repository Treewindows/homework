package org.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.example.Person.Person;
import org.example.Math.calculator;

/**
 * Hello world!
 */
public class App {
    private static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        Person human = new Person("Дмитрий", "Денисов", "Юрьевич", 29, 1, 1970);
        Person human2 = new Person("Валерия", "Егорова", "Юрьевна", 23, 9, 1982);
        Person human3 = new Person.Builder("Борис", "Исаев", "Анатольевич", 5, 10, 1997)
                .citizenship("ЮАР")
                .weight(68)
                .height(169)
                .build();
        Person human4 = new Person.Builder("Александр", "Осипов", "Иванович", 9, 3, 1975)
                .sex("Мужской")
                .citizenship("РФ")
                .build();
        logger.info("\nИмя -  {}\nФамилия -  {}\nОтчество - {}\n{}Полных лет - {}", human.getFirstName(), human.getLastName(), human.getFatherName(), human.dateOfbirth(), human.getAge());
        human.getAge();

        logger.info("\nИмя -  {}\nФамилия -  {}\nОтчество - {}\n{}Полных лет - {}", human2.getFirstName(), human2.getLastName(), human2.getFatherName(), human2.dateOfbirth(), human2.getAge());
        human2.getAge();

        logger.info(String.valueOf(human3));

        logger.info(String.valueOf(human4));

        logger.info("Результат сложения: {}", calculator.addition(2.2, 2.3));
        logger.info("Результат деления: {}", calculator.division(2.2, 2.3));
        logger.info("Результат умножения: {}", calculator.multiplication(2.2, 2.3));
        logger.info("Результат вычитания: {}", calculator.subtraction(2.2, 2.3));
        logger.info("Результат возведения числа в квадрат: {}", calculator.squaring(2.2));
    }

}