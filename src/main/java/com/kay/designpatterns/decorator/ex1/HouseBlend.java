package com.kay.designpatterns.decorator.ex1;

/**
 * Created by Kai.L on 8/14/2019
 */
public class HouseBlend extends Beverage {
    @Override
    public String getDescription() {
        return "HouseBlend";
    }

    @Override
    public double cost() {
        return 2.3;
    }
}
