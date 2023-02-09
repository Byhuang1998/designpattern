package com.byhuang.prototype.shallowclone;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 15:26
 * @description TODO
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Certificate certificate1 = new Certificate();
        certificate1.setStu(new Student("张三"));
        Certificate clone = (Certificate) certificate1.clone();

        clone.getStu().setName("李四");

        certificate1.show();
        clone.show();

        // 两句话打印的都是李四
        // 这是因为clone()方法是浅克隆，因此对于引用类型属性，克隆出的对象中的属性仍指向原对象的属性所在地址
    }
}
