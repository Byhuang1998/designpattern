package com.byhuang.prototype.shallowclone;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 15:38
 * @description TODO
 */
public class Student {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
