
package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.Person.Alexander;
import org.example.Person.Boris;
import org.example.Person.Dmitriy;
import org.example.Person.Valeria;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {

        Boris boris = new Boris();
        Valeria valeria = new Valeria();
        Dmitriy dmitriy = new Dmitriy();
        Alexander alexander = new Alexander();
        logger.info(boris);
        logger.info(valeria);
        logger.info(dmitriy);
        logger.info(alexander);


    }
}