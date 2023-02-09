package com.byhuang.factory.simplefactory.before;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 10:34
 * @description TODO
 */
public class TestCoffeeStore {

    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        try {
            store.orderCoffee("America");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
