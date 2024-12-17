package org.example.LessonVisitor;

public class Rectangle implements NumberOfPoint{
    private Line firstLine;
    private Line secondLine;

    private Visitor visitor;
    public Rectangle(Line firstLine, Line secondLine) {
        this.firstLine = firstLine;
        this.secondLine = secondLine;
        visitor = new VisitorNumberOfPoint();
    }
    public Double Squar(){
        return firstLine.lengthLine()*secondLine.lengthLine();
    }
    public Double Perimetr(){
        return (firstLine.lengthLine()+secondLine.lengthLine())*2;
    }

    @Override
    public Double numberOfPoint() {
        return visitor.numberOfPoint(this);
    }
}
