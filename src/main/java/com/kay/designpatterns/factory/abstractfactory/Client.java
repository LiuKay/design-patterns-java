package com.kay.designpatterns.factory.abstractfactory;

import com.kay.designpatterns.factory.PizzaType;

/**
 * @author Kai Liu
 * @date 11/4/2019
 **/
public class Client {
    public static void main(String[] args) {
        PizzaStore store = new NYPizzaStore();
        AbstractPizza pizza = store.orderPizza(PizzaType.CheesePizza);

    }
}
