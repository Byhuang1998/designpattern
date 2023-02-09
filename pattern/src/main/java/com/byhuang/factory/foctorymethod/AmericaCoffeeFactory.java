package com.byhuang.factory.foctorymethod;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 11:04
 * @description TODO
 */
public class AmericaCoffeeFactory implements CoffeeFactory {

    public Coffee produceCoffee() {
        return new AmericaCoffee();
    }
}
