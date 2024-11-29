package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Person;

/**
 * Hello world!
 */
public class App {
    private static Logger logger = LogManager.getLogger(App.class);
    public static void main(String[] args) {
        /**
         * Напишите класс (ФИО, дата рождения, номер мобильного, цвет волос, город рождения) где equals будет проверять
         * только (ФИО(несмотря на регистр), дата рождения, город рождения) и написать hashCode используя Objects.hash
         * на эти же значения
         * */
        Person person = new Person("Борис Денисов Николаевич", 18, "Сентября", 1992, 79153269785L,
                "Блодин", "Тверь");
        /**
         * Разница в номере телефона и цвета волос
         */
        Person person1 = new Person("Борис Денисов Николаевич", 18, "Сентября", 1992, 79877895758L,
                "Седые", "Тверь");
        /**
         * Разница в ФИО, дате рождления, город рождения
         */
        Person person2 = new Person("Борис Жадаев Николаевич", 19, "Сентября", 1972, 79153269785L,
                "Блодин", "Москва");
        /**
         * Разница в ФИО
         */
        Person person3 = new Person("Юлия Иванова Александрова", 18, "Сентября", 1992, 79153269785L,
                "Блодин", "Тверь");
        /**
         * Разница в  дате рождления(день)
         */
        Person person4 = new Person("Борис Денисов Николаевич", 19, "Сентября", 1992, 79153269785L,
                "Блодин", "Тверь");
        /**
         * Разница в  дате рождления(месяц)
         */
        Person person5 = new Person("Борис Денисов Николаевич", 18, "Мая", 1992, 79153269785L,
                "Блодин", "Тверь");
        /**
         * Разница в  дате рождления(год)
         */
        Person person6 = new Person("Борис Денисов Николаевич", 18, "Сентября", 1996, 79153269785L,
                "Блодин", "Тверь");
        /**
         * Разница в  городе рождления
         */
        Person person7 = new Person("Борис Денисов Николаевич", 18, "Сентября", 1992, 79153269785L,
                "Блодин", "Самара");
        logger.info(person.equals(person1));
        logger.info(person.equals(person1));
        logger.info(person.equals(person2));
        logger.info(person.equals(person3));
        logger.info(person.equals(person4));
        logger.info(person.equals(person5));
        logger.info(person.equals(person6));
        logger.info(person.equals(person7));
        logger.info(person.hashCode()+ " " +person1.hashCode()+ " " + person2.hashCode()+ " "+ person3.hashCode()+ " "+person4.hashCode());
    }
}
