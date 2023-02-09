package com.byhuang.prototype;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 15:22
 * @description TODO
 */
public class Certificate implements Cloneable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Certificate) super.clone();
    }

    public void show() {
        System.out.println(name + "获得了奖状");
    }
}
