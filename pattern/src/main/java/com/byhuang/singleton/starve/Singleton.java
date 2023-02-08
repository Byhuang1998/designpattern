package com.byhuang.singleton.starve;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/8 15:30
 * @description TODO
 */
public class Singleton {

    private Singleton() {
    }

    private static final Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
