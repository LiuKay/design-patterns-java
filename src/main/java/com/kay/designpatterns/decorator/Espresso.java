package com.kay.designpatterns.decorator;

/**
 * 浓咖啡
 * Created by Kai.L on 8/14/2019
 */
public class Espresso extends Beverage {

    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 1.2;
    }
}
