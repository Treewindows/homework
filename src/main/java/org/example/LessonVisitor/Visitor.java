package org.example.LessonVisitor;

import java.awt.*;

public interface Visitor {
    Double numberOfPoint(Circle circle);
    Double numberOfPoint(Triangle triangle);
    Double numberOfPoint(Rectangle rectangle);
}
