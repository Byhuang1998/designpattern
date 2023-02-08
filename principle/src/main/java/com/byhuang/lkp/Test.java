package com.byhuang.lkp;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/8 15:02
 * @description TODO
 */
public class Test {

    public static void main(String[] args) {
        Agent agent = new Agent(new Star("starA"), new Fan("fanB"), new Company("companyE"));
        agent.meet();
        agent.cooperate();
    }
}
