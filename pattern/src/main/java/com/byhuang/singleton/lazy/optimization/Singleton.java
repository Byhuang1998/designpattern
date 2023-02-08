package com.byhuang.singleton.lazy.optimization;

/**
 * @author mskj-huangbingyi
 * @version 1.0
 * @date 2023/2/8 16:01
 * @description TODO
 */
public class Singleton {

    private Singleton() {
    }

    private static volatile Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
