package com.byhuang.singleton.lazy.innerclass;

/**
 * @author mskj-huangbingyi
 * @version 1.0
 * @date 2023/2/8 21:42
 * @description TODO
 */
public class Singleton {

    private Singleton() {
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
