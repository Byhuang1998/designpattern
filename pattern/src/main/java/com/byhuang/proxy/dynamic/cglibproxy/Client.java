package com.byhuang.proxy.dynamic.cglibproxy;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 21:33
 * @description TODO
 */
public class Client {

    public static void main(String[] args) {
        ProxyFactory factory = new ProxyFactory();
        TrainStation proxyObject = factory.getProxyObject();
        proxyObject.sell();
    }
}
