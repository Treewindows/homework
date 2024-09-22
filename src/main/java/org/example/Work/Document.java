package org.example.Work;

import java.util.Random;

public class Document {
    private final Integer minMed = 18292015;
    private final Integer maxMed = 19292015;

    private final Integer maxNumberHigherEducation = 200000;

    private final Integer minNumberHigherEducation = 102222;

    private final Integer maxSeriesHigherEducation = 2000000;

    private final Integer mixSeriesHigherEducation = 1253595;

    private final String NameMedBook = "Медицинская книжка";

    private final String NameHigherEducation = "Высшее образование";


    public String getNameMedBook() {
        return NameMedBook;
    }

    public String getNameHigherEducation() {
        return NameHigherEducation;
    }

    public Integer getNumberMedBook() {
        Random ran = new Random();
        return ((ran.nextInt(100000) * (maxMed - minMed)) / 100000) + minMed;

    }

    public Integer getNumberHigherEducation() {
        Random ran = new Random();
        return ((ran.nextInt(100000) * (maxNumberHigherEducation - minNumberHigherEducation)) / 100000) + minNumberHigherEducation;

    }

    public Integer getSeriesHigherEducation() {
        Random ran = new Random();
        return (((ran.nextInt(100000)) * (maxSeriesHigherEducation - mixSeriesHigherEducation)) / 100000) + mixSeriesHigherEducation;

    }

}
