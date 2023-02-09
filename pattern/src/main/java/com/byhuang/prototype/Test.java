package com.byhuang.prototype;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 15:26
 * @description TODO
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Certificate certificate1 = new Certificate();
        Certificate clone = (Certificate) certificate1.clone();

        certificate1.setName("张三");
        clone.setName("李四");

        certificate1.show();
        clone.show();
    }
}
