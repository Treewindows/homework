package org.example.Person;

import org.example.Work.Cook;

public class Dmitriy extends Cook {
    private String firstName = "Дмитрий";
    private String lastName = "Исаев";

    private String fatherName = "Анатольевич";

    private Integer age = 47;

    public Dmitriy() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.age = age;
    }


    @Override
    public String toString() {
        return String.format("ФИО: %s %s %s.\nВозраст: %d.\nПрофессия: %s.\n%s", firstName, lastName, fatherName, age, getProfession(), getMedBook());
    }
}