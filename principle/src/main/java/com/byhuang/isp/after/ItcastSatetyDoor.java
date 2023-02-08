package com.byhuang.isp.after;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/8 12:09
 * @description TODO
 */
public class ItcastSatetyDoor implements AntiTheft, WaterProof {

    @Override
    public void antiTheft() {
        System.out.println("antiTheft");
    }

    @Override
    public void waterProof() {
        System.out.println("waterProof");
    }
}
