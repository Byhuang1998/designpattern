package com.byhuang.prototype.deepclone;

import java.io.Serializable;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 15:38
 * @description TODO
 */
public class Student implements Serializable {

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
