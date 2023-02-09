package com.byhuang.factory.foctorymethod;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 10:34
 * @description TODO
 */
public class TestCoffeeStore {

    public static void main(String[] args) {

        CoffeeStore store = new CoffeeStore();
        AmericaCoffeeFactory factory = new AmericaCoffeeFactory();
//        AmericaCoffeeFactory factory = new LatteCoffeFactory();
        store.setFactory(factory);
        Coffee coffee = store.orderCoffee();
        coffee.addSugar();
        coffee.addMilk();
        System.out.println(coffee.getName());
    }
}
