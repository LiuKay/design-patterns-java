package com.kay.designpatterns.decorator.ex1;

/**
 * Created by Kai.L on 8/14/2019
 */
public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
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
