package com.byhuang.proxy.dynamic.jdkproxy;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 21:33
 * @description TODO
 */
public class Client {

    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();
        SellTickets proxyObject = factory.getProxyObject();
        proxyObject.sell();
    }
}
