package org.example.Work;

public abstract class Cook extends Work implements MedBook {
    Document document = new Document();

    /**
     * Функция возвращает название профессии
     * @return название профессии
     */
    @Override
    public String getProfession() {
        return "Повар";
    }
    /**
     * Функция возвращает название документа
     * @return название название и номер медкнижки
     */
    @Override
    public String getMedBook() {
        return String.format("Название документа: %s.\nНомер медицинской книжки: %d.\n", document.getNameMedBook(), document.getNumberMedBook());
    }
}
