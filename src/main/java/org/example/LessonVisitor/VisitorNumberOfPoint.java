package org.example.LessonVisitor;

import java.awt.*;

public class VisitorNumberOfPoint  implements  Visitor{


    @Override
    public Double numberOfPoint(Circle circle) {
        return ((circle.Square()*0.2)+(circle.Perimeter()*0.8));
    }

    @Override
    public Double numberOfPoint(Triangle triangle) {
        return ((triangle.Squar()*0.2)+(triangle.Perimeter()*0.8));
    }
    public Double numberOfPoint(Rectangle rectangle){
        return ((rectangle.Squar()*0.2)+(rectangle.Perimetr()*0.8));
    }
}
