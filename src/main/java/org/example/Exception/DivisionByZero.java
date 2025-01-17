package org.example.Exception;

import static org.example.App.logger;

public class DivisionByZero extends ArithmeticException {
    public DivisionByZero() {
       logger.info("На ноль делить нельзя");
    }
    public DivisionByZero(String message){
        super(message);
    }
}
