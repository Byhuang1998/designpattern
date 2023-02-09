package com.byhuang.factory.abstracfactory;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 10:28
 * @description TODO
 */
public class FoodStore {

    private FoodFactory factory;

    public FoodFactory getFactory() {
        return factory;
    }

    public void setFactory(FoodFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee() {
        return factory.produceCoffee();
    }

    public Dessert orderDessert() {
        return factory.produceDessert();
    }
}
