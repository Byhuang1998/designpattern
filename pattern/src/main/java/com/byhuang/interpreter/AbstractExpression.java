package com.byhuang.interpreter;

/**
 * @version v1.0
 * @ClassName: AbstractExpression
 * @Description: 抽象表达式类
 * @Author: huangbingyi
 */
public abstract class AbstractExpression {

    public abstract int interpret(Context context);
}
