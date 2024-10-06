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