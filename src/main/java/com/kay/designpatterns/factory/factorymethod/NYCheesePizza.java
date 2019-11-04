package com.kay.designpatterns.factory.factorymethod;

import com.kay.designpatterns.factory.CheesePizza;

/**
 * @author Kai Liu
 * @date 11/4/2019
 **/
class NYCheesePizza extends CheesePizza {

    @Override
    public void box() {
        System.out.println("NYCheesePizza 独特的打包");
    }
}
