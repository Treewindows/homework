package org.example.Work;

public abstract class Cook extends Work implements MedBook {

    Document document = new Document();

    @Override
    public String getProfession() {
        return "Повар";
    }

    @Override
    public String getMedBook() {
        return String.format("Название документа: %s.\nНомер медицинской книжки: %d.\n", document.getNameMedBook(), document.getNumberMedBook());
    }
}
