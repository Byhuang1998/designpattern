package com.byhuang.factory.abstracfactory;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 10:34
 * @description TODO
 */
public class Client {

    public static void main(String[] args) {

        FoodStore store = new FoodStore();
//        FoodFactory factory = new ItalyFactory();
        FoodFactory factory = new AmericaFactory();
        store.setFactory(factory);

        Coffee coffee = store.orderCoffee();
        Dessert dessert = store.orderDessert();

        coffee.addMilk();
        coffee.addSugar();
        System.out.println(coffee.getName());
        System.out.println(dessert.getName());
    }
}
