package com.kay.designpatterns.builder.ex2;

/**
 * 餐饮
 *
 * @author kay
 * @date 2019/10/13
 */
public class Dining implements Item {
    @Override
    public String name() {
        return "餐饮";
    }

    @Override
    public String getDuration() {
        return "一日三餐";
    }

    @Override
    public Double getPrice() {
        return 100.00D;
    }
}
