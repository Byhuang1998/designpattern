package com.byhuang.proxy.dynamic.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 21:59
 * @description 获取代理对象的工厂类
 */
public class ProxyFactory {
    private final TrainStation trainStation = new TrainStation();

    public SellTickets getProxyObject() {

        return (SellTickets) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("模拟方法的加强：收取代理商服务费");
                        return method.invoke(trainStation, args);
                    }
                }
        );
    }
}
