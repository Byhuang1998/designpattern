package com.byhuang.factory.abstracfactory;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 10:24
 * @description TODO
 */
public abstract class Coffee {

    public abstract String getName();

    void addSugar() {
        System.out.println("加糖");
    }

    void addMilk() {
        System.out.println("加奶");
    }

}
