package org.example.Work;

public abstract class Engineer extends Work implements higherEducation {
    Document document = new Document();

    /**
     * Функция возвращает название профессии
     *
     * @return название профессии
     */
    @Override
    public String getProfession() {
        return "Инженер";
    }

    @Override
    public String getHigherEducation() {
        return String.format("Название документа: %s.\nНомер Высшего образования: %d.\nСерия Высшего образования: %d.", document.getNameHigherEducation(), document.getNumberHigherEducation(), document.getSeriesHigherEducation());
    }
}
