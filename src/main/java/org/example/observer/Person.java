package org.example.observer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.example.App;

import java.util.Objects;

public class Person implements Subscriber {

    private static Logger logger = LogManager.getLogger(App.class);

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String txtMsg) {
        logger.info(getName() + " узнал(-а) что погода изменилась через приложение на телефоне." + txtMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
