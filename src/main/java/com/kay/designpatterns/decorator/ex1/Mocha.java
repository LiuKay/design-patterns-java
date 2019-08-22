package com.kay.designpatterns.decorator.ex1;

/**
 * Created by Kai.L on 8/14/2019
 */
public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        double cost = this.beverage.cost();
        Size size = getSize();
        switch (size) {
            case TALL:
                cost = cost + 0.6;
                break;
            case GRANDE:
                cost += 0.4;
                break;
            case VENTI:
                cost += 0.2;
                break;
        }
        return cost;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + "+ Mocha";
    }
}
