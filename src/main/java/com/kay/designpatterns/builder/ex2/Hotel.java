package com.kay.designpatterns.builder.ex2;

/**
 * @author kay
 * @date 2019/10/13
 */
class Hotel implements Item {

    @Override
    public String name() {
        return "住宿";
    }

    @Override
    public String getDuration() {
        return "住宿3天";
    }

    @Override
    public Double getPrice() {
        return 900.00;
    }
}
