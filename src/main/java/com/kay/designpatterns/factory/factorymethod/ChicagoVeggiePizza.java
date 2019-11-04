package com.kay.designpatterns.factory.factorymethod;

import com.kay.designpatterns.factory.VeggiePizza;

/**
 * @author Kai Liu
 * @date 11/4/2019
 **/
class ChicagoVeggiePizza extends VeggiePizza {

    @Override
    public void prepare() {
        System.out.println("ChicagoVeggiePizza 准备");
    }
}
