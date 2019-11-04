package com.kay.designpatterns.factory.factorymethod;

import com.kay.designpatterns.factory.VeggiePizza;

/**
 * @author Kai Liu
 * @date 11/4/2019
 **/
class NYVeggiePizza extends VeggiePizza {
    @Override
    public void cut() {
        System.out.println("NYVeggiePizza 祖传刀法分切而成");
    }
}
