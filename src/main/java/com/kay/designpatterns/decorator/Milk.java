package com.kay.designpatterns.decorator;

/**
 * Created by Kai.L on 8/14/2019
 */
public class Milk extends CondimentDecorator {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + 0.5;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + "+ Milk";
    }
}
