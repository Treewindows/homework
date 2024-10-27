package org.example.Person;

import org.example.Work.Doctor;

public class Boris extends Doctor {
    private String firstName = "Борис";
    private String lastName = "Денисов";
    private String fatherName = "Денисов";
    private Integer age = 36;

    public Boris() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("ФИО: %s %s %s.\nВозраст: %d.\nПрофессия: %s.\n%s%s", firstName, lastName, fatherName, age, getProfession(), getMedBook(), getHigherEducation());
    }
}
