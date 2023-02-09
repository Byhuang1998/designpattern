package com.byhuang.proxy.dynamic.jdkproxy;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 21:34
 * @description TODO
 */
public class TrainStation implements SellTickets {

    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
