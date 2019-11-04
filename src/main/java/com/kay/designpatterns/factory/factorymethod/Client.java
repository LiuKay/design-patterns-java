package com.kay.designpatterns.factory.factorymethod;

import com.kay.designpatterns.factory.Pizza;
import com.kay.designpatterns.factory.PizzaType;

/**
 * @author Kai Liu
 * @date 11/4/2019
 **/
class Client {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza veggiePizza = pizzaStore.orderPizza(PizzaType.VeggiePizza);

        System.out.println("-------------------");

        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
        Pizza cheesePizza = chicagoPizzaStore.orderPizza(PizzaType.CheesePizza);
    }
}
