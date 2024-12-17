package org.example.decorator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.App;

public class ReadyMadeVegetables {
    private static Logger logger = LogManager.getLogger(App.class);
    public void cook(){
        logger.info("Овощи готовы для готовки");
    }
}
