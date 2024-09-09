package org.example.Person;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

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

    public String dateOfbirth() {

        return String.format("Дата рождения %d.%d.%d \n", getDayBirthday(), getMonthBirthday(), getYearBirthday());
    }

    public Long getAge() {

        LocalDate start = LocalDate.of(getYearBirthday(), getMonthBirthday(), getDayBirthday());
        LocalDate end = LocalDate.now();
        Long years = ChronoUnit.YEARS.between(start, end);
        return years;
    }

    public static class Builder {
        private final String firstName;
        private final String lastName;
        private final String fatherName;
        private final Integer dayBirthday;
        private final Integer monthBirthday;
        private final Integer yearBirthday;
        private String citizenship = null;
        private String sex = null;
        private Integer height = null;
        private Integer weight = null;

        public Builder(String firstName, String lastName, String fatherName, Integer dayBirthday, Integer monthBirthday, Integer yearBirthday) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fatherName = fatherName;
            this.dayBirthday = dayBirthday;
            this.monthBirthday = monthBirthday;
            this.yearBirthday = yearBirthday;
        }

        public Person.Builder citizenship(String citizenship) {
            this.citizenship = citizenship;
            return this;
        }

        public Person.Builder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public Person.Builder height(int height) {
            this.height = height;
            return this;
        }

        public Person.Builder weight(int weight) {
            this.weight = weight;
            return this;
        }


        public Person build() {
            return new Person(this);
        }
    }


    public String toString() {
        final StringBuilder sb = new StringBuilder("\nДанные: ").append("\n");
        sb.append("Имя: ").append(firstName).append(".\n");
        sb.append("Фамилия: ").append(lastName).append(".\n");
        sb.append("Отчество: ").append(fatherName).append(".\n");
        sb.append("Дата рождения: ").append(dayBirthday).append(".").append(monthBirthday).append(".").append(yearBirthday).append(".\n");
        sb.append("Полных лет: ").append(getAge()).append(".\n");
        sb.append("Гражданство: ").append(citizenship).append(".\n");
        sb.append("Пол: ").append(sex).append(".\n");
        sb.append("Рост:").append(height).append(".\n");
        sb.append("Вес: ").append(weight).append(".\n");
        return sb.toString();
    }

    private Person(Person.Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        fatherName = builder.fatherName;
        dayBirthday = builder.dayBirthday;
        monthBirthday = builder.monthBirthday;
        yearBirthday = builder.yearBirthday;
        citizenship = builder.citizenship;
        sex = builder.sex;
        height = builder.height;
        weight = builder.weight;

    }


}
