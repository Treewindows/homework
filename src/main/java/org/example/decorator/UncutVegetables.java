package org.example.decorator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.App;

public class UncutVegetables extends ReadyMadeVegetables{
    private static Logger logger = LogManager.getLogger(App.class);
    @Override
    public void cook(){
        logger.info("Овощи необходимо нарезать");
        super.cook();
    }
}
