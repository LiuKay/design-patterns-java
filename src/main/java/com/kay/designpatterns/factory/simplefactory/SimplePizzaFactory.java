package com.kay.designpatterns.factory.simplefactory;

import com.kay.designpatterns.factory.CheesePizza;
import com.kay.designpatterns.factory.Pizza;
import com.kay.designpatterns.factory.VeggiePizza;

/**
 * @author Kai Liu
 * @date 11/1/2019
 **/
class SimplePizzaFactory {

    Pizza createPizza(String type){
        Pizza pizza = null;
        switch (type) {
            case "CheesePizza":
                pizza = new CheesePizza();
                break;
            case "VeggiePizza":
                pizza = new VeggiePizza();
                break;
            default:
                System.err.println("Unknown pizza type.");
                break;
        }
        return pizza;
    }

}
