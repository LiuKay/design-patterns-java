package com.kay.designpatterns.factory.factorymethod;

import com.kay.designpatterns.factory.Pizza;
import com.kay.designpatterns.factory.PizzaType;

/**
 * @author Kai Liu
 * @date 11/1/2019
 **/
class ChicagoPizzaStore extends PizzaStore{

    @Override
    public Pizza createPizza(PizzaType type) {
        System.out.println("ChicagoPizzaFactory create pizza...");
        Pizza pizza = null;
        switch (type) {
            case CheesePizza:
                pizza = new ChicagoCheesePizza();
                break;
            case VeggiePizza:
                // 其他类似。。。
                pizza = new ChicagoVeggiePizza();
                break;
            default:
                System.err.println("Unknown pizza type.");
                break;
        }
        return pizza;
    }

}
