package com.kay.designpatterns.strategy.ex1;

/**
 * Created by Kai.L on 8/28/2019
 */
public class NoQuack implements IQuack {
    @Override
    public void quack() {
        System.out.println("no quack");
    }
}
