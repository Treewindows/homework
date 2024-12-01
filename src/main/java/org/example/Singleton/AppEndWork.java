package org.example.Singleton;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.App;

import static org.example.App.logger;

public class AppEndWork {
    private static Logger logger = LogManager.getLogger(AppEndWork.class);
    public AppEndWork(){
        logger.info("Приложение завершило работу");
    }
}
