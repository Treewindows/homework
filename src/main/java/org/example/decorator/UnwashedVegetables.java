package org.example.decorator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.App;

public class UnwashedVegetables extends UnpeeledVegetables{
    private static Logger logger = LogManager.getLogger(App.class);
    public void cook(){
        logger.info("Овощи необходимо помыть от грязи");
        super.cook();
    }
}
