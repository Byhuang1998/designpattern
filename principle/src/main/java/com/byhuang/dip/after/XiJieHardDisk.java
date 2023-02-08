package com.byhuang.dip.after;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/8 10:47
 * @description TODO
 */
public class XiJieHardDisk implements HardDisk {

    @Override
    public void save() {
        System.out.println("XiJieHardDisk is saving...");
    }
}
