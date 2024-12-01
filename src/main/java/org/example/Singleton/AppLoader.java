package org.example.Singleton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AppLoader {
    private static Logger logger = LogManager.getLogger(AppLoader.class);
    public AppLoader(){
        logger.info("Приложение запустилось");
    }
    public void appWork(){
        logger.info("Приложение работает");
    }
}
