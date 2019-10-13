package com.kay.designpatterns.builder.ex2;

/**
 * 景点游玩
 *
 * @author kay
 * @date 2019/10/13
 */
public class Attractions implements Item {
    @Override
    public String name() {
        return "景点游玩";
    }

    @Override
    public String getDuration() {
        return "半天";
    }

    @Override
    public Double getPrice() {
        return 300.00D;
    }
}
