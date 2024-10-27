package org.example.Person;

import org.example.Work.Engineer;


public class Valeria extends Engineer {
    private String firstName = "Валерия";
    private String lastName = "Егорова";

    private String fatherName = "Юрьевна";

    private Integer age = 23;

    public Valeria() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("ФИО: %s %s %s.\nВозраст: %d.\nПрофессия: %s.\n%s\n", firstName, lastName, fatherName, age, getProfession(), getHigherEducation());
    }
}