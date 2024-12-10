package org.example.patternFactory.product;

public class CheeseProduct implements FoodProduct{
    /**
     * Функция названия продукта
     * @return возвращает названия продукта
     */
    @Override
    public String getName() {
        return "Сыр";
    }
    /**
     * Функция цену продукта
     * @return возвращает цену продукта
     */
    @Override
    public Integer getPrice() {
        return 250;
    }
}
