package com.byhuang.isp.after;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/8 12:08
 * @description TODO
 */
public class HeimaSafetyDoor implements AntiTheft, FireProof, WaterProof {

    @Override
    public void antiTheft() {
        System.out.println("antiTheft");
    }

    @Override
    public void fireProof() {
        System.out.println("fireProof");
    }

    @Override
    public void waterProof() {
        System.out.println("waterProof");
    }
}
