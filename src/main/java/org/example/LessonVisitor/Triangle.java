package org.example.LessonVisitor;

public class Triangle implements NumberOfPoint{
    private Dot firstDot;
    private Dot secondDot;
    private Dot trirdDot;
    private  Visitor visitor;
    public Triangle(Dot firstDot, Dot secondDot, Dot trirdDot) {
        this.firstDot = firstDot;
        this.secondDot = secondDot;
        this.trirdDot = trirdDot;
        visitor = new VisitorNumberOfPoint();
    }

    public Dot getFirstDot() {
        return firstDot;
    }

    public void setFirstDot(Dot firstDot) {
        this.firstDot = firstDot;
    }

    public Dot getSecondDot() {
        return secondDot;
    }

    public void setSecondDot(Dot secondDot) {
        this.secondDot = secondDot;
    }

    public Dot getTrirdDot() {
        return trirdDot;
    }

    public void setTrirdDot(Dot trirdDot) {
        this.trirdDot = trirdDot;
    }

    public Double Perimeter(){
        Double ABX = (getSecondDot().x()- getFirstDot().x());
        Double ABY =(getSecondDot().y()- getFirstDot().y());
        Double BCX = (getTrirdDot().x()- getSecondDot().x());
        Double BCY =(getTrirdDot().y()- getSecondDot().y());
        Double CAX = (getTrirdDot().x()- getFirstDot().x());
        Double CAY =(getTrirdDot().y()- getFirstDot().y());
        Double AB = Math.sqrt((ABX*ABX)+(ABY*ABY));
        Double BC = Math.sqrt((BCX*BCX)+(BCY*BCY));
        Double CA = Math.sqrt((CAX*CAX)+(CAY*CAY));
        Double Perimetr =  AB + CA + BC;
        return Perimetr;
    }

    private Double halfPerimeter(){
        return 0.5*Perimeter();
    }
    public Double Squar(){
        Double ABX = (getSecondDot().x()- getFirstDot().x());
        Double ABY =(getSecondDot().y()- getFirstDot().y());
        Double BCX = (getTrirdDot().x()- getSecondDot().x());
        Double BCY =(getTrirdDot().y()- getSecondDot().y());
        Double CAX = (getTrirdDot().x()- getFirstDot().x());
        Double CAY =(getTrirdDot().y()- getFirstDot().y());
        Double AB = Math.sqrt((ABX*ABX)+(ABY*ABY));
        Double BC = Math.sqrt((BCX*BCX)+(BCY*BCY));
        Double CA = Math.sqrt((CAX*CAX)+(CAY*CAY));
        return Math.sqrt(halfPerimeter()*(halfPerimeter()-AB)*(halfPerimeter()-BC)*(halfPerimeter()-CA));
    }

    @Override
    public Double numberOfPoint() {
        return visitor.numberOfPoint(this);
    }
}
