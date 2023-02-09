package com.byhuang.factory.simplefactory.after;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 10:28
 * @description TODO
 */
public class CoffeeStore {

    public void orderCoffee(String type) throws Exception {

        CoffeeSimpleFactory.produceCoffee(type);

    }
}
