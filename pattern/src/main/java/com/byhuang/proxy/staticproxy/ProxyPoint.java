package com.byhuang.proxy.staticproxy;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 21:34
 * @description TODO
 */
public class ProxyPoint implements SellTickets {

    @Override
    public void sell() {
        System.out.println("代理点收取一些服务费，模拟方法增强");
    }
}
