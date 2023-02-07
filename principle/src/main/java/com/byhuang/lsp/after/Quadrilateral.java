package com.byhuang.lsp.after;

/**
 * @author mskj-huangbingyi
 * @version 1.0
 * @date 2023/2/7 21:22
 * @description 四边形基类
 */
public class Quadrilateral {

    private int length;

    private int width;

    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
