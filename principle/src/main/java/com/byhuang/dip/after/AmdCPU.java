package com.byhuang.dip.after;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/8 11:55
 * @description TODO
 */
public class AmdCPU implements CPU {

    @Override
    public void process() {
        System.out.println("AmdCPU is processing");
    }
}
