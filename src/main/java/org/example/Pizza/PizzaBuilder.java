package org.example.Pizza;



public class PizzaBuilder {
    private final Pizza pizza;
    public PizzaBuilder(){
        pizza = new Pizza();
    }
    public PizzaBuilder withDough(){
        pizza.setDough("Тесто");
        return this;
    }
    public PizzaBuilder withCheese(){
        pizza.setCheese("Сыр");
        return this;
    }
    public PizzaBuilder withSauce(){
        pizza.setSauce("Соус");
        return this;
    }
    public PizzaBuilder withSausage(){
        pizza.setSausage("Колбаса");
        return this;
    }
    public PizzaBuilder withGreenery(){
        pizza.setGreenery("Зелень");
        return this;
    }
    public PizzaBuilder withMushrooms(){
        pizza.setMushrooms("Грибы");
        return this;
    }
    public PizzaBuilder withPineapples(){
        pizza.setPineapples("Ананас");
        return this;
    }
    public PizzaBuilder withChiken(){
        pizza.setChiken("Курица");
        return this;
    }
    public Pizza build(){
            if (pizza.getDough() == null) {
                throw new RuntimeException("Отсутствует тесто");

            }
            if (pizza.getCheese() == null) {
                throw new RuntimeException("Отсутствует сыр");

            }
            if (pizza.getSauce() == null) {
                throw new RuntimeException("Отсутствует соус");
            }
           return pizza;
    }
}
