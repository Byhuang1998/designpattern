package com.byhuang.factory.configfactory;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 10:28
 * @description TODO
 */
public class CoffeeStore {

    public Coffee orderCoffee(String type) {

        return ConfigCoffeeFactory.produceCoffee(type);

    }
}
