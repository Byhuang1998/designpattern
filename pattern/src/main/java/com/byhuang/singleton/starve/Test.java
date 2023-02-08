package com.byhuang.singleton.starve;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/8 15:31
 * @description TODO
 */
public class Test {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        // 二者对应同一块内存
        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance1 == instance2);
    }
}
