package com.byhuang.lsp.after;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/7 21:06
 * @description 正方形类
 */
public class Square extends Quadrilateral {

    private int side;

    public Square(int side) {
        super(side, side);
        setSide(side);
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
