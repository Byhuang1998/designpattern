package com.byhuang.prototype.deepclone;

import java.io.*;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 15:26
 * @description 深克隆
 */
public class Test {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Certificate certificate1 = new Certificate();
        certificate1.setStu(new Student("张三"));

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("G:\\testFile\\a.txt"));
        oos.writeObject(certificate1);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("G:\\testFile\\a.txt"));
        Certificate clone = (Certificate) ois.readObject();
        ois.close();

        clone.getStu().setName("李四");

        certificate1.show();
        clone.show();
    }
}
