package com.byhuang.dip.before;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/8 11:45
 * @description TODO
 */
public class ComputerDemo {

    public static void main(String[] args) {
        Computer computer = new Computer(new IntelCPU(), new XiJieHardDisk(), new KingstonMemory());
        computer.start();
    }
}
