package com.byhuang.factory.simplefactory.after;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 10:37
 * @description TODO
 */
public class CoffeeSimpleFactory {

    public void produceCoffee(String type) throws Exception {
        Coffee coffee;
        if ("America".equals(type)) {
            coffee = new AmericaCoffee();
        } else if ("Latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new Exception("没有这种类型的咖啡");
        }
        coffee.addSugar();
        coffee.addMilk();
        System.out.println(coffee.getName());
    }
}
