package com.byhuang.singleton.lazy.innerclass;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/8 21:42
 * @description TODO
 */
public class Client {

    public static void main(String[] args) {

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance1 == instance2);
    }
}
