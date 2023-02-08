package com.byhuang.singleton.starve._enum;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/8 15:47
 * @description TODO
 */
public class Test {

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;

        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton1 == singleton2);

    }
}
