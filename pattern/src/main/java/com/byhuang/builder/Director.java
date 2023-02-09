package com.byhuang.builder;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 17:23
 * @description TODO
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
