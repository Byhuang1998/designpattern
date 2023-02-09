package com.byhuang.factory.foctorymethod;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 11:05
 * @description TODO
 */
public class LatteCoffeFactory implements CoffeeFactory {

    public Coffee produceCoffee() {
        return new LatteCoffee();
    }
}
