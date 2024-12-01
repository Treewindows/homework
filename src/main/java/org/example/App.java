package org.example;

import org.example.Pizza.Pizza;
import org.example.Pizza.PizzaBuilder;
import org.example.Singleton.AppEndWork;
import org.example.Singleton.AppEndWorkSingleton;
import org.example.Singleton.AppLoader;
import org.example.Singleton.AppLoaderSingleton;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * Hello world!
 */
public class App {
    public static Logger logger = LogManager.getLogger(App.class);
    public static void main(String[] args) {
        /**
         * Реализовать функциональнал singleton  запуск приложения в программе;
         */
        AppLoader app1 = AppLoaderSingleton.getInstant();
        AppLoader app2 = AppLoaderSingleton.getInstant();
        AppLoader app3 = AppLoaderSingleton.getInstant();
        app1.appWork();
        app2.appWork();
        app3.appWork();
        AppEndWork app4 = AppEndWorkSingleton.getInstant();
        AppEndWork app5 = AppEndWorkSingleton.getInstant();
        AppEndWork app6 = AppEndWorkSingleton.getInstant();
        /**
         * Реализовать функционал builder создание пиццы (тесто, сыр, соус обязательно)
         * (колбаса, зелень, помидоры, грибы, анансы , курица опционально)
         */
        Pizza pizza1 = new PizzaBuilder().withDough().withCheese().withSauce().build();
        Pizza pizza2 = new PizzaBuilder().withDough().withCheese().withSauce().withGreenery().build();
        Pizza pizza3 = new PizzaBuilder().withDough().withCheese().withSauce().withGreenery().withChiken().withPineapples().build();
        Pizza pizza4 = new PizzaBuilder().withDough().withCheese().withSauce().withGreenery().withChiken().withPineapples().withMushrooms().build();
        logger.info(pizza1);
        logger.info(pizza2);
        logger.info(pizza3);
        logger.info(pizza4);
    }
}
