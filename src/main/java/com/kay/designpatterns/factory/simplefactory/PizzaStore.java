package com.kay.designpatterns.factory.simplefactory;


import com.kay.designpatterns.factory.Pizza;

/**
 * Simple Factory
 * @author Kai Liu
 * @date 11/1/2019
 **/
class PizzaStore {

    private SimplePizzaFactory pizzaFactory = null;

    PizzaStore(SimplePizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    void orderPizza(String type) {
//        Pizza pizza = new Pizza();
        Pizza pizza = pizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
    }

}
