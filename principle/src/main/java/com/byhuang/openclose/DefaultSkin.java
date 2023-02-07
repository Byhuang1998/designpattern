package com.byhuang.openclose;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/7 15:14
 * @description 默认皮肤继承皮肤抽象类
 */
public class DefaultSkin extends Skin {

    @Override
    public void display() {
        System.out.println("Default Skin!");
    }
}
