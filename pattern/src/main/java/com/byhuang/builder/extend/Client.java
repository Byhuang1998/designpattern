package com.byhuang.builder.extend;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 20:25
 * @description TODO
 */
public class Client {

    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .cpu("Intel")
                .memory("Kingston")
                .screen("Samsung")
                .hardDisk("WestData")
                .build();
        System.out.println(computer);
    }
}
