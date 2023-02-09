package com.byhuang.factory.abstracfactory;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 12:02
 * @description TODO
 */
public class ItalyFactory extends FoodFactory {

    @Override
    public Coffee produceCoffee() {
        return new ItalyCoffee();
    }

    @Override
    public Dessert produceDessert() {
        return new  ItalyDessert();
    }
}
