package com.byhuang.lkp;

/**
 * @author huangbingyi
 * @version 1.0
 * @date 2023/2/8 14:21
 * @description TODO
 */
public class Agent {

    private Star star;

    private Fan fan;

    public Agent(Star star, Fan fan, Company company) {
        this.star = star;
        this.fan = fan;
        this.company = company;
    }

    private Company company;

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public Fan getFan() {
        return fan;
    }

    public void setFan(Fan fan) {
        this.fan = fan;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void meet() {
        System.out.println(star.getName() + " meets " + fan.getName());
    }

    public void cooperate() {
        System.out.println(star.getName() + " cooperates with " + company.getName());
    }
}
