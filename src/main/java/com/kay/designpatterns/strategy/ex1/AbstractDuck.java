package com.kay.designpatterns.strategy.ex1;

/**
 * Created by Kai.L on 8/28/2019
 */
public abstract class AbstractDuck {

    ISwim swim;

    IFly fly;

    IQuack quack;

    public void quack(){
        this.quack.quack();
    }

    public void swim() {
        this.swim.swim();
    }

    public void fly() {
        this.fly.fly();
    }

    public ISwim getSwim() {
        return swim;
    }

    public void setSwim(ISwim swim) {
        this.swim = swim;
    }

    public IFly getFly() {
        return fly;
    }

    public void setFly(IFly fly) {
        this.fly = fly;
    }

    public IQuack getQuack() {
        return quack;
    }

    public void setQuack(IQuack quack) {
        this.quack = quack;
    }

    public abstract void description();
}
