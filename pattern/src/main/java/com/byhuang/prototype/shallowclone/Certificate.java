package com.byhuang.prototype.shallowclone;

/**
 * @author mskj-huangbingyi
 * @version 1.0
 * @date 2023/2/9 15:22
 * @description TODO
 */
public class Certificate implements Cloneable {

    private Student stu;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return (Certificate) super.clone();
    }

    public void show() {
        System.out.println(stu.getName() + "获得了奖状");
    }
}
