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

    /**
     * Функция возвращает название документа
     *
     * @return название документа
     */
    public String getNameMedBook() {
        return NameMedBook;
    }

    /**
     * Функция возвращает название документа
     *
     * @return название документа
     */
    public String getNameHigherEducation() {
        return NameHigherEducation;
    }

    /**
     * Функция возвращает номер документа
     *
     * @return номер документа
     */
    public Integer getNumberMedBook() {
        Random ran = new Random();
        return ((ran.nextInt(100000) * (maxMed - minMed)) / 100000) + minMed;
    }

    /**
     * Функция возвращает номер документа
     *
     * @return номер документа
     */
    public Integer getNumberHigherEducation() {
        Random ran = new Random();
        return ((ran.nextInt(100000) * (maxNumberHigherEducation - minNumberHigherEducation)) / 100000) + minNumberHigherEducation;
    }

    /**
     * Функция возвращает серию документа
     *
     * @return серию документа
     */
    public Integer getSeriesHigherEducation() {
        Random ran = new Random();
        return (((ran.nextInt(100000)) * (maxSeriesHigherEducation - mixSeriesHigherEducation)) / 100000) + mixSeriesHigherEducation;
    }
}