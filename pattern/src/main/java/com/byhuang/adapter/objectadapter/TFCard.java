package com.byhuang.adapter.objectadapter;

/**
 * @version v1.0
 * @ClassName: TFCard
 * @Description: 适配者类的接口
 * @Author: huangbingyi
 */
public interface TFCard {

    //从TF卡中读取数据
    String readTF();
    //往TF卡中写数据
    void writeTF(String msg);
}
