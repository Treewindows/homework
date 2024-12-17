package org.example.LessonVisitor;

public class Circle implements NumberOfPoint{
    private Double Radius;
    private Visitor visitor;
    public Circle(Double radius) {
        Radius = radius;
        visitor = new VisitorNumberOfPoint();
    }

    public Double getRadius() {
        return Radius;
    }

    public void setRadius(Double radius) {
        Radius = radius;
    }
    public Double Square(){
        return 3.14 * (getRadius()*getRadius());
    }
    public Double Perimeter(){
        return 3.14 * getRadius();
    }

    @Override
    public Double numberOfPoint() {
        return visitor.numberOfPoint(this);
    }
}
