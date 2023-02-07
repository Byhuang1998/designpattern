package com.byhuang;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/7 15:11
 * @description 输入法的皮肤
 */
public abstract class Skin {

    private String skin;

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public void display() {
        System.out.println(skin);
    }
}
