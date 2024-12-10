package org.example.patternFactory.product;

public class ChocolateProduct implements FoodProduct{
    /**
     * Функция названия продукта
     * @return возвращает названия продукта
     */
    @Override
    public String getName() {
        return "шоколадка";
    }
    /**
     * Функция цену продукта
     * @return возвращает цену продукта
     */
    @Override
    public Integer getPrice() {
        return 115;
    }
}
