package org.example.patternFactory.product;

public class SausageProduct implements FoodProduct{
    /**
     * Функция названия продукта
     * @return возвращает названия продукта
     */
    @Override
    public String getName() {
        return "колбаса";
    }
    /**
     * Функция цену продукта
     * @return возвращает цену продукта
     */
    @Override
    public Integer getPrice() {
        return 240;
    }
}
