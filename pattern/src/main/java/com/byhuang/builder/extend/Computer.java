package com.byhuang.builder.extend;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 20:24
 * @description TODO
 */
public class Computer {

    private String cpu;

    private String memory;

    private String screen;

    private String hardDisk;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.memory = builder.memory;
        this.screen = builder.screen;
        this.hardDisk = builder.hardDisk;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", memory='" + memory + '\'' +
                ", screen='" + screen + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                '}';
    }

    public static final class Builder {

        private String cpu;

        private String memory;

        private String screen;

        private String hardDisk;

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder memory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder screen(String screen) {
            this.screen = screen;
            return this;
        }

        public Builder hardDisk(String hardDisk) {
            this.hardDisk = hardDisk;
            return this;
        }

        // 使用构建者创建Computer对象
        public Computer build() {
            return new Computer(this);
        }
    }

    // 最后的build()方法返回产品类Computer，中间的构造方法都仍然返回Builder对象本身
}
