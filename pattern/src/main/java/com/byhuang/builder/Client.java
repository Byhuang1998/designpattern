package com.byhuang.builder;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 17:24
 * @description TODO
 */
public class Client {

    public static void main(String[] args) {
        Director director = new Director(new MobileBuilder());
        Bike bike = director.construct();

        System.out.println(bike);

    }
}
