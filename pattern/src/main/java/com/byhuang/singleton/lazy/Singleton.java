package com.byhuang.singleton.lazy;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/8 15:46
 * @description 懒汉式
 */
public class Singleton {

    private Singleton() {
    }

    private static Singleton instance;

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
