package org.example;

import Shape.Shape;
import Shape.Square;
import Shape.Circle;
import Shape.Parallelogram;
import Shape.Rectangle;
import Shape.rightAngledTriangle;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import Address.Russia.steetV;
import Address.Russia.StreetSp;
import Address.Russia.StreetVladivostok;
import Address.USA.StreetM;
/**
 * Hello world!
 */
public class App {
    private static Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {

        Shape square = new Square(2.0);
        Shape circle = new Circle(2.0);
        Shape parallelogram = new Parallelogram(4.0, 3.0);
        Shape rectangle = new Rectangle(5.0, 9.0);
        Shape rightAngledTriangle = new rightAngledTriangle(6.0, 8.0);


        String[] shape = new String[]{
                square.area(),
                circle.area(),
                parallelogram.area(),
                rectangle.area(),
                rightAngledTriangle.area(),

        };

        steetV streetV = new steetV();
        StreetSp streetSP = new StreetSp();
        StreetVladivostok streetVl = new StreetVladivostok();
        StreetM streetM = new StreetM();
        for (Integer i = 0; i < shape.length; i++) {
            logger.info(shape[i]);

        }
        logger.info(streetV.address());
        logger.info(streetSP.address());
        logger.info(streetVl.address());
        logger.info(streetM.address());
    }
}