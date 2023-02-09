package com.byhuang.builder;

/**
 * @author mskj-huangbingyi
 * @version 1.0
 * @date 2023/2/9 17:20
 * @description TODO
 */
public abstract class Builder {

    protected Bike bike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();
}
