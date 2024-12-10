package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.patternFactory.product.CheeseProduct;
import org.example.patternFactory.product.ChocolateProduct;
import org.example.patternFactory.product.SausageProduct;
import org.example.patternState.DraftTask;

import org.example.patternState.NewTask;
import org.example.patternState.TaskState;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args ) {
        /**
         * Реализовать паттерн factory ( 3 фабрики: шоколадная , колбасная и сырная производят соответствующие
         * продукты, у продуктов должно быть название и цена)
         */
        ArrayList <ShoppingСart> shoppingCart = new ArrayList<>();
        shoppingCart.add(new ShoppingСart(new CheeseProduct()));
        shoppingCart.add(new ShoppingСart(new ChocolateProduct()));
        shoppingCart.add(new ShoppingСart(new SausageProduct()));
        Integer sum = 0;
        for (ShoppingСart shoppingСart:shoppingCart){
            sum += shoppingСart.putProduct.getPrice();
        }
        ArrayList <ShoppingСart> shoppingСarts2 = new ArrayList<>();
        shoppingCart.add(new ShoppingСart(new ChocolateProduct()));
        shoppingCart.add(new ShoppingСart(new SausageProduct()));
        Integer sum2 = 0;
        for (ShoppingСart shoppingСart2:shoppingCart){
            sum2 += shoppingСart2.putProduct.getPrice();
        }
        logger.info(sum);
        logger.info(sum2);
        /**
         * Реализовать петтерн state задачи:
         */
        TaskState task = new DraftTask()
                .newTask()
                .analysisTask()
                .taskAtWork()
                .taskInReady();

        TaskState task2 = new NewTask()
                .analysisTask()
                .taskAtWork()
                .draftTask()
                .newTask()
                .analysisTask()
                .taskAtWork();
        logger.info(task.getSNameState());
        logger.info(task2.getSNameState());
    }
}
