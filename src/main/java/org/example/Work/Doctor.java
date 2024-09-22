package org.example.Work;

public class Doctor extends Work implements MedBook, higherEducation {

    Document document = new Document();

    @Override
    public String getProfession() {
        return "Врач";
    }

    @Override
    public String getMedBook() {
        return String.format("Название документа: %s.\nНомер медицинской книжки: %d.\n", document.getNameMedBook(), document.getNumberMedBook());
    }

    @Override
    public String getHigherEducation() {
        return String.format("Название документа: %s.\nНомер Высшего образования: %d.\nСерия Высшего образования: %d.", document.getNameHigherEducation(), document.getNumberHigherEducation(), document.getSeriesHigherEducation());
    }

}
