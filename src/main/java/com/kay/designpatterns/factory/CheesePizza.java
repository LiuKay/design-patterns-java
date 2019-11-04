package com.kay.designpatterns.factory;

/**
 * @author Kai Liu
 * @date 11/4/2019
 **/
public class CheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("CheesePizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("CheesePizza bake");
    }

    @Override
    public void cut() {
        System.out.println("CheesePizza cut");
    }

    @Override
    public void box() {
        System.out.println("box CheesePizza");
    }
}
