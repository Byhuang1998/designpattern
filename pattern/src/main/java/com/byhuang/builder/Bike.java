package com.byhuang.builder;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/9 17:20
 * @description TODO
 */
public class Bike {

    private String frame;

    private String seat;

    public Bike() {

    }

    public Bike(String frame, String seat) {
        this.frame = frame;
        this.seat = seat;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "frame='" + frame + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}
