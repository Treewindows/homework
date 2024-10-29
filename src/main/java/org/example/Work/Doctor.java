package org.example.Work;

public class Doctor extends Work implements MedBook, higherEducation {

    Document document = new Document();

    /**
     * Функция возвращает название профессии
     *
     * @return название профессии
     */
    @Override
    public String getProfession() {
        return "Врач";
    }

    /**
     * Функция возвращает название документа
     *
     * @return название название и номер медкнижки
     */
    @Override
    public String getMedBook() {
        return String.format("Название документа: %s.\nНомер медицинской книжки: %d.\n", document.getNameMedBook(), document.getNumberMedBook());
    }

    /**
     * Функция возвращает название документа
     *
     * @return название название, номер и серию Высшего образования
     */
    @Override
    public String getHigherEducation() {
        return String.format("Название документа: %s.\nНомер Высшего образования: %d.\nСерия Высшего образования: %d.", document.getNameHigherEducation(), document.getNumberHigherEducation(), document.getSeriesHigherEducation());
    }
}
