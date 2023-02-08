package com.byhuang.dip.after;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/8 10:43
 * @description Intel CPU
 */
public class IntelCPU implements CPU {

    @Override
    public void process() {
        System.out.println("IntelCPU is processing...");
    }
}
