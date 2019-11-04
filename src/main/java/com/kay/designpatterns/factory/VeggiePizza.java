package com.kay.designpatterns.factory;

/**
 * @author Kai Liu
 * @date 11/4/2019
 **/
public class VeggiePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("VeggiePizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("VeggiePizza bake");

    }

    @Override
    public void cut() {
        System.out.println("VeggiePizza cut");

    }

    @Override
    public void box() {
        System.out.println("box VeggiePizza");
    }
}
