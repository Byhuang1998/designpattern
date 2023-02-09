package com.byhuang.builder;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 17:22
 * @description TODO
 */
public class MobileBuilder extends Builder {


    @Override
    public void buildFrame() {
        bike.setFrame("mobile frame");
        System.out.println("Mobile frame");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("mobile seat");
        System.out.println("Mobile seat");
    }

    @Override
    public Bike createBike() {
        System.out.println("Mobile bike built");
        return bike;
    }
}
