package com.byhuang.factory.configfactory;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 10:34
 * @description TODO
 */
public class TestCoffeeStore {

    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
//        Coffee coffee = store.orderCoffee("america");
        Coffee coffee = store.orderCoffee("latte");
        coffee.addMilk();
        coffee.addSugar();
        System.out.println(coffee.getName());
    }
}
