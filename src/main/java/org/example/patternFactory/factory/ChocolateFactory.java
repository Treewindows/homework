package org.example.patternFactory.factory;

import org.example.patternFactory.product.CheeseProduct;
import org.example.patternFactory.product.FoodProduct;

public class ChocolateFactory implements  FoodFactory{
    /**
     * Функция создает продукт
     * @return возвращает продукт
     */
    @Override
    public FoodProduct createProduct() {
        return new CheeseProduct();
    }
}
