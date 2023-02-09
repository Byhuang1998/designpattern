package com.byhuang.factory.foctorymethod;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 10:28
 * @description TODO
 */
public class CoffeeStore {

    private CoffeeFactory factory;

    public CoffeeFactory getFactory() {
        return factory;
    }

    public void setFactory(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee() {
        return factory.produceCoffee();
    }
}
