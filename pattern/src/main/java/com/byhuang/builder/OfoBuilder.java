package com.byhuang.builder;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 17:22
 * @description TODO
 */
public class OfoBuilder extends Builder {

    @Override
    public void buildFrame() {
        bike.setFrame("ofo frame");
        System.out.println("Ofo frame");
    }

    @Override
    public void buildSeat() {
        bike.setSeat("ofo seat");
        System.out.println("Ofo seat");
    }

    @Override
    public Bike createBike() {
        System.out.println("Ofo bike built");
        return bike;
    }
}
