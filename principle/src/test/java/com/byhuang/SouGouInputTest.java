package com.byhuang;

import com.byhuang.openclose.SouGouInput;
import com.byhuang.openclose.SpecialSkin;
import org.junit.Test;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/7 15:13
 * @description 测试搜狗输入法
 */
public class SouGouInputTest {

    @Test
    public void testSouGouInput() {
        SouGouInput input = new SouGouInput();
        input.setSkin(new SpecialSkin());
        input.display();
    }
}
