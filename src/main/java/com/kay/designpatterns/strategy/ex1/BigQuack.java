package com.kay.designpatterns.strategy.ex1;

/**
 * Created by Kai.L on 8/28/2019
 */
class BigQuack implements IQuack {
    @Override
    public void quack() {
        System.out.println("quack big");
    }
}
