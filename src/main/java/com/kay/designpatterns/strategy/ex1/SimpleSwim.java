package com.kay.designpatterns.strategy.ex1;

/**
 * Created by Kai.L on 8/28/2019
 */
class SimpleSwim implements ISwim {
    @Override
    public void swim() {
        System.out.println("I can swim simply");
    }
}
