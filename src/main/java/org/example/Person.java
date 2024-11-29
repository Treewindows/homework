package org.example;

import java.util.Objects;

public class Person {
    private String fullName;
    //private Integer dateOfBithday;
    private Integer dayOfBrithday;
    private String monthOfBirthday;
    private Integer yearOfBirthday;
    private Long numberPhone;
    private String colorHair;
    private String cityOfBirth;

    public Person(String fullName, Integer dayOfBrithday, String monthOfBirthday, Integer yearOfBirthday,
                  Long numberPhone, String colorHair, String cityOfBirth) {
        this.fullName = fullName;
        this.dayOfBrithday = dayOfBrithday;
        this.monthOfBirthday = monthOfBirthday;
        this.yearOfBirthday = yearOfBirthday;
        this.numberPhone = numberPhone;
        this.colorHair = colorHair;
        this.cityOfBirth = cityOfBirth;
    }

    public Integer getDayOfBrithday() {
        return dayOfBrithday;
    }

    public void setDayOfBrithday(Integer dayOfBrithday) {
        this.dayOfBrithday = dayOfBrithday;
    }

    public String getMonthOfBirthday() {
        return monthOfBirthday;
    }

    public void setMonthOfBirthday(String monthOfBirthday) {
        this.monthOfBirthday = monthOfBirthday;
    }

    public Integer getYearOfBirthday() {
        return yearOfBirthday;
    }

    public void setYearOfBirthday(Integer yearOfBirthday) {
        this.yearOfBirthday = yearOfBirthday;
    }

    private String dataOfBirthday() {
        return String.format("%d %s %d", getDayOfBrithday(), getMonthOfBirthday(), getYearOfBirthday());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            Person person1 = (Person) obj;
            return fullName.equals(person1.fullName) && dataOfBirthday().equals(person1.dataOfBirthday()) && cityOfBirth.equals(person1.cityOfBirth);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName,dataOfBirthday(),cityOfBirth);
    }
}
