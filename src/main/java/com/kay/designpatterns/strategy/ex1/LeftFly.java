package com.kay.designpatterns.strategy.ex1;

/**
 * Created by Kai.L on 8/28/2019
 */
class LeftFly implements IFly {
    @Override
    public void fly() {
        System.out.println("left fly..");
    }
}
