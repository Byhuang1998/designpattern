package com.byhuang.lsp.before;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/7 21:06
 * @description 正方形类
 */
public class Square extends Rectangle {

    public Square(int length, int width) {
        super(length, width);
    }

    @Override
    public void setLength(int length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setLength(width);
    }
}
