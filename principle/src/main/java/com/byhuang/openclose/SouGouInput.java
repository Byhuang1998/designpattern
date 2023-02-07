package com.byhuang.openclose;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/7 15:10
 * @description 用输入法来作为示例
 */
public class SouGouInput {

    private Skin skin;

    public Skin getSkin() {
        return skin;
    }

    public void setSkin(Skin skin) {
        this.skin = skin;
    }

    public void display() {
        skin.display();
    }
}
