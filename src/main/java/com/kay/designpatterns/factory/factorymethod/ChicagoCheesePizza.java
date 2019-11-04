package com.kay.designpatterns.factory.factorymethod;

import com.kay.designpatterns.factory.CheesePizza;

/**
 * @author Kai Liu
 * @date 11/4/2019
 **/
class ChicagoCheesePizza extends CheesePizza {

    @Override
    public void bake() {
        System.out.println("ChicagoCheesePizza 特有的烘烤");
    }

}
