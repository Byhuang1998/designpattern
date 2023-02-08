package com.byhuang.isp.after;

import com.byhuang.isp.before.HeimaSafetyDoor;

/**
 * @author mskj-huangbingyi
 * @version 1.0
 * @date 2023/2/8 12:10
 * @description TODO
 */
public class Client {

    public static void main(String[] args) {
        HeimaSafetyDoor door1 = new HeimaSafetyDoor();
        door1.antiTheft();
        door1.fireProof();
        door1.waterProof();

        System.out.println("=========");

        ItcastSatetyDoor door2 = new ItcastSatetyDoor();
        door2.antiTheft();
        door2.waterProof();
    }
}
