package org.example.patternFactory.factory;

import org.example.patternFactory.product.FoodProduct;
import org.example.patternFactory.product.SausageProduct;

public class SausageFactory implements  FoodFactory{
    /**
     * Функция создает продукт
     * @return возвращает продукт
     */
    @Override
    public FoodProduct createProduct() {
        return new SausageProduct();
    }
}
