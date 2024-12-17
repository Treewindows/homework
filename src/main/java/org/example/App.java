package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.LessonVisitor.*;
import org.example.decorator.ReadyMadeVegetables;
import org.example.decorator.UnwashedVegetables;


import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        ArrayList<NumberOfPoint> numberOfPoints = new ArrayList<>();
        numberOfPoints.add((new Circle(5.0)));
        numberOfPoints.add((new Circle(3.2)));
        numberOfPoints.add((new Circle(5.4)));
        numberOfPoints.add((new Triangle(new Dot(1.0,2.0),new Dot(3.0,2.0),new Dot(2.0,5.0))));
        numberOfPoints.add((new Triangle(new Dot(2.0,3.0),new Dot(5.0,8.0),new Dot(7.0,13.0))));
        numberOfPoints.add((new Triangle(new Dot(8.0,7.0),new Dot(8.0,12.0),new Dot(7.0,9.0))));
        numberOfPoints.add(new Rectangle(new Line(new Dot(2.0,3.0),new Dot(7.0,6.0)),new Line(new Dot(9.0,12.0),new Dot(15.0,18.0))));
        Double numberAllpoint =0.0;
        for (NumberOfPoint numberOfPoint:numberOfPoints){
            numberAllpoint += numberOfPoint.numberOfPoint();
        }
        logger.info(numberAllpoint);
        ReadyMadeVegetables readyMadeVegetables =new UnwashedVegetables();
        readyMadeVegetables.cook();
    }
}
