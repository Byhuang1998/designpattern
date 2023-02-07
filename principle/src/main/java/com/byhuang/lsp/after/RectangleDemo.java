package com.byhuang.lsp.after;


/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/7 21:13
 * @description TODO
 */
public class RectangleDemo {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(20, 10);
        resize(r);
        print(r);

        // 对于下面这段代码，在resize()方法中会陷入死循环
        // 违背了里氏代换原则
        // 任何基类可以出现的地方，子类一定可以出现
        Square s = new Square(10);
        resize(s);
        print(s);
    }

    private static void resize(Quadrilateral r) {
        while (r.getWidth() <= r.getLength()) {
            r.setWidth(r.getWidth() + 1);
        }

    }

    private static void print(Quadrilateral r) {
        System.out.println(r.getLength());
        System.out.println(r.getWidth());
    }


}
