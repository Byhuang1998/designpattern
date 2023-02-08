package com.byhuang.isp.before;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/8 12:03
 * @description TODO
 */
public class Client {

    public static void main(String[] args) {
        HeimaSafetyDoor door = new HeimaSafetyDoor();
        door.antiTheft();
        door.fireProof();
        door.waterProof();
    }
}
