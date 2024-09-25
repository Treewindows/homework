package org.example.Person;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Написать класс Person с полями (имя, фамилия, отчество, дата рождения) и их getter/setter и использовать ее в main
 */
public class Person {
    private String firstName;
    private String lastName;
    private String fatherName;
    private Integer dayBirthday;
    private Integer monthBirthday;
    private Integer yearBirthday;
    private String citizenship;
    private String sex;

    private Integer height;
    private Integer weight;

    /**
     * Конструктор Person с полями (имя, фамилия, отчество, дата рождения) и их getter/setter и использовать ее в main
     *
     * @param firstName
     * @param lastName
     * @param fatherName
     * @param dayBirthday
     * @param monthBirthday
     * @param yearBirthday
     */

    public Person(String firstName, String lastName, String fatherName, Integer dayBirthday, Integer monthBirthday, Integer yearBirthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.dayBirthday = dayBirthday;
        this.monthBirthday = monthBirthday;
        this.yearBirthday = yearBirthday;
    }

    /**
     * Дополнить класс Person полями (гражданство, пол, рост, вес) где обязательные поля только (имя, фамилия, дата рождения) и есть метод getAge() который по текущему дню определяет количество полных лет
     */
    /**
     * Конструктор Person с полями Имя,Фамилия,Отчество,день рождения,месяц рождения, год рождения, гражданство.
     *
     * @param firstName
     * @param lastName
     * @param fatherName
     * @param dayBirthday
     * @param monthBirthday
     * @param yearBirthday
     * @param citizenship
     */

    public Person(String firstName, String lastName, String fatherName, Integer dayBirthday, Integer monthBirthday, Integer yearBirthday, String citizenship) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.dayBirthday = dayBirthday;
        this.monthBirthday = monthBirthday;
        this.yearBirthday = yearBirthday;
        this.citizenship = citizenship;
    }

    /**
     * Конструктор Person с полями Имя,Фамилия,Отчество,день рождения,месяц рождения, год рождения, гражданство, пол.
     *
     * @param firstName
     * @param lastName
     * @param fatherName
     * @param dayBirthday
     * @param monthBirthday
     * @param yearBirthday
     * @param citizenship
     * @param sex
     */
    public Person(String firstName, String lastName, String fatherName, Integer dayBirthday, Integer monthBirthday, Integer yearBirthday, String citizenship, String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.dayBirthday = dayBirthday;
        this.monthBirthday = monthBirthday;
        this.yearBirthday = yearBirthday;
        this.citizenship = citizenship;
        this.sex = sex;
    }

    /**
     * Конструктор Person с полями Имя,Фамилия,Отчество,день рождения,месяц рождения, год рождения, пол.
     *
     * @param firstName
     * @param lastName
     * @param fatherName
     * @param sex
     * @param dayBirthday
     * @param monthBirthday
     * @param yearBirthday
     */
    public Person(String firstName, String lastName, String fatherName, String sex, Integer dayBirthday, Integer monthBirthday, Integer yearBirthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.dayBirthday = dayBirthday;
        this.monthBirthday = monthBirthday;
        this.yearBirthday = yearBirthday;
        this.sex = sex;
    }

    /**
     * Конструктор Person с полями Имя,Фамилия,Отчество,день рождения,месяц рождения, год рождения, гражданство, пол, рост.
     *
     * @param firstName
     * @param lastName
     * @param fatherName
     * @param dayBirthday
     * @param monthBirthday
     * @param yearBirthday
     * @param citizenship
     * @param sex
     * @param height
     */
    public Person(String firstName, String lastName, String fatherName, Integer dayBirthday, Integer monthBirthday, Integer yearBirthday, String citizenship, String sex, Integer height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.dayBirthday = dayBirthday;
        this.monthBirthday = monthBirthday;
        this.yearBirthday = yearBirthday;
        this.citizenship = citizenship;
        this.sex = sex;
        this.height = height;
    }

    /**
     * Конструктор Person с полями Имя,Фамилия,Отчество,день рождения,месяц рождения, год рождения, рост.
     *
     * @param firstName
     * @param lastName
     * @param fatherName
     * @param dayBirthday
     * @param monthBirthday
     * @param yearBirthday
     * @param height
     */
    public Person(String firstName, String lastName, String fatherName, Integer dayBirthday, Integer monthBirthday, Integer yearBirthday, Integer height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.dayBirthday = dayBirthday;
        this.monthBirthday = monthBirthday;
        this.yearBirthday = yearBirthday;
        this.height = height;
    }

    /**
     * Конструктор Person с полями Имя,Фамилия,Отчество,день рождения,месяц рождения, год рождения, гражданство, рост.
     *
     * @param firstName
     * @param lastName
     * @param fatherName
     * @param dayBirthday
     * @param monthBirthday
     * @param yearBirthday
     * @param citizenship
     * @param height
     */
    public Person(String firstName, String lastName, String fatherName, Integer dayBirthday, Integer monthBirthday, Integer yearBirthday, String citizenship, Integer height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.dayBirthday = dayBirthday;
        this.monthBirthday = monthBirthday;
        this.yearBirthday = yearBirthday;
        this.citizenship = citizenship;
        this.height = height;
    }

    /**
     * Конструктор Person с полями Имя,Фамилия,Отчество,день рождения,месяц рождения, год рождения, пол, рост.
     *
     * @param firstName
     * @param lastName
     * @param fatherName
     * @param dayBirthday
     * @param monthBirthday
     * @param yearBirthday
     * @param height
     * @param sex
     */
    public Person(String firstName, String lastName, String fatherName, Integer dayBirthday, Integer monthBirthday, Integer yearBirthday, Integer height, String sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.dayBirthday = dayBirthday;
        this.monthBirthday = monthBirthday;
        this.yearBirthday = yearBirthday;
        this.citizenship = sex;
        this.height = height;
    }

    /**
     * Конструктор Person с полями Имя,Фамилия,Отчество,день рождения,месяц рождения, год рождения, гражданство, пол, рост,вес.
     *
     * @param firstName
     * @param lastName
     * @param fatherName
     * @param dayBirthday
     * @param monthBirthday
     * @param yearBirthday
     * @param citizenship
     * @param sex
     * @param height
     * @param weight
     */
    public Person(String firstName, String lastName, String fatherName, Integer dayBirthday, Integer monthBirthday, Integer yearBirthday, String citizenship, String sex, Integer height, Integer weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.dayBirthday = dayBirthday;
        this.monthBirthday = monthBirthday;
        this.yearBirthday = yearBirthday;
        this.citizenship = citizenship;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
    }

    /**
     * Конструктор Person с полями Имя,Фамилия,Отчество,день рождения,месяц рождения, год рождения, рост,вес.
     *
     * @param firstName
     * @param lastName
     * @param fatherName
     * @param dayBirthday
     * @param monthBirthday
     * @param yearBirthday
     * @param height
     * @param weight
     */
    public Person(String firstName, String lastName, String fatherName, Integer dayBirthday, Integer monthBirthday, Integer yearBirthday, Integer height, Integer weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.dayBirthday = dayBirthday;
        this.monthBirthday = monthBirthday;
        this.yearBirthday = yearBirthday;
        this.height = height;
        this.weight = weight;
    }

    /**
     * Конструктор Person с полями Имя,Фамилия,Отчество,день рождения,месяц рождения, год рождения, гражданство, вес.
     *
     * @param firstName
     * @param lastName
     * @param fatherName
     * @param citizenship
     * @param dayBirthday
     * @param monthBirthday
     * @param yearBirthday
     * @param weight
     */
    public Person(String firstName, String lastName, String fatherName, String citizenship, Integer dayBirthday, Integer monthBirthday, Integer yearBirthday, Integer weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.dayBirthday = dayBirthday;
        this.monthBirthday = monthBirthday;
        this.yearBirthday = yearBirthday;
        this.citizenship = citizenship;
        this.weight = weight;
    }

    /**
     * Конструктор Person с полями Имя,Фамилия,Отчество,день рождения,месяц рождения, год рождения,  пол, вес.
     *
     * @param firstName
     * @param lastName
     * @param fatherName
     * @param dayBirthday
     * @param sex
     * @param monthBirthday
     * @param yearBirthday
     * @param weight
     */
    public Person(String firstName, String lastName, String fatherName, Integer dayBirthday, String sex, Integer monthBirthday, Integer yearBirthday, Integer weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.dayBirthday = dayBirthday;
        this.monthBirthday = monthBirthday;
        this.yearBirthday = yearBirthday;
        this.sex = sex;
        this.weight = weight;
    }

    /**
     * Конструктор Person с полями Имя,Фамилия,Отчество,день рождения,месяц рождения, год рождения, гражданство,  рост,вес.
     *
     * @param firstName
     * @param lastName
     * @param fatherName
     * @param dayBirthday
     * @param monthBirthday
     * @param yearBirthday
     * @param citizenship
     * @param height
     * @param weight
     */
    public Person(String firstName, String lastName, String fatherName, Integer dayBirthday, Integer monthBirthday, Integer yearBirthday, String citizenship, Integer height, Integer weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.dayBirthday = dayBirthday;
        this.monthBirthday = monthBirthday;
        this.yearBirthday = yearBirthday;
        this.citizenship = citizenship;
        this.height = height;
        this.weight = weight;
    }

    /**
     * Конструктор Person с полями Имя,Фамилия,Отчество,день рождения,месяц рождения, год рождения, пол, рост,вес.
     *
     * @param firstName
     * @param lastName
     * @param fatherName
     * @param dayBirthday
     * @param monthBirthday
     * @param sex
     * @param yearBirthday
     * @param height
     * @param weight
     */
    public Person(String firstName, String lastName, String fatherName, Integer dayBirthday, Integer monthBirthday, String sex, Integer yearBirthday, Integer height, Integer weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.dayBirthday = dayBirthday;
        this.monthBirthday = monthBirthday;
        this.yearBirthday = yearBirthday;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
    }

    /**
     * Конструктор Person с полями Имя,Фамилия,Отчество,день рождения,месяц рождения, год рождения, гражданство, пол, вес.
     *
     * @param firstName
     * @param lastName
     * @param fatherName
     * @param dayBirthday
     * @param monthBirthday
     * @param sex
     * @param yearBirthday
     * @param citizenship
     * @param weight
     */
    public Person(String firstName, String lastName, String fatherName, Integer dayBirthday, Integer monthBirthday, String sex, Integer yearBirthday, String citizenship, Integer weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.dayBirthday = dayBirthday;
        this.monthBirthday = monthBirthday;
        this.yearBirthday = yearBirthday;
        this.citizenship = citizenship;
        this.sex = sex;
        this.weight = weight;
    }

    /**
     * Конструктор Person с полями Имя,Фамилия,Отчество,день рождения,месяц рождения, год рождения, вес.
     *
     * @param firstName
     * @param lastName
     * @param weight
     * @param fatherName
     * @param dayBirthday
     * @param monthBirthday
     */
    public Person(String firstName, String lastName, Integer weight, String fatherName, Integer dayBirthday, Integer monthBirthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.dayBirthday = dayBirthday;
        this.monthBirthday = monthBirthday;
        this.weight = weight;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public Integer getDayBirthday() {
        return dayBirthday;
    }

    public void setDayBirthday(Integer dayBirthday) {
        this.dayBirthday = dayBirthday;
    }

    public Integer getMonthBirthday() {
        return monthBirthday;
    }

    public void setMonthBirthday(Integer monthBirthday) {
        this.monthBirthday = monthBirthday;
    }

    public Integer getYearBirthday() {
        return yearBirthday;
    }

    public void setYearBirthday(Integer yearBirthday) {
        this.yearBirthday = yearBirthday;
    }

    /**
     * Возвращает дату рождения
     *
     * @return
     */
    public String dateOfBirth() {

        return String.format("%d.%d.%d", getDayBirthday(), getMonthBirthday(), getYearBirthday());
    }

    /**
     * Возвращает количество полных лет
     *
     * @return fullYears
     */
    public Long fullYears() {

        LocalDate start = LocalDate.of(getYearBirthday(), getMonthBirthday(), getDayBirthday());
        LocalDate end = LocalDate.now();
        Long fullYears = ChronoUnit.YEARS.between(start, end);
        return fullYears;
    }

    @Override
    public String toString() {
        return String.format("\nИмя = %s\nФамилия = %s\nОтчество = %s\nДата рождения = %s\nПолных лет = %d\nГражданство = %s\nПол = %s\nРост = %d\nВес = %d", firstName, lastName, fatherName, dateOfBirth(), fullYears(), citizenship, sex, height, weight);
    }
}
