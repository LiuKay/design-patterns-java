package com.kay.designpatterns.strategy.ex1;

/**
 * Created by Kai.L on 8/28/2019
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        this.fly = new LeftFly();
        this.quack = new BigQuack();
        this.swim = new SimpleSwim();
    }

    @Override
    public void description() {
        System.out.println("model duck");
    }
}
