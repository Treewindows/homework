package org.example.Person;

import org.example.Work.Loader;

public class Alexander extends Loader {
    private String firstName = "Александр";
    private String lastName = "Осипов";

    private String fatherName = "Иванович";

    private Integer age = 41;
    public static Integer k;

    public Alexander() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.age = age;
    }


    @Override
    public String toString() {
        return String.format("ФИО: %s %s %s.\nВозраст: %d.\nПрофессия: %s.\n", firstName, lastName, fatherName, age, getProfession());
    }
}