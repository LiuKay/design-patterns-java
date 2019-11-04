package com.kay.designpatterns.factory.abstractfactory;

import com.kay.designpatterns.factory.PizzaType;

/**
 * @author Kai Liu
 * @date 11/4/2019
 **/
abstract class PizzaStore {

    final AbstractPizza orderPizza(PizzaType type) {
        AbstractPizza pizza= createPizza(type);

        // 无变化的业务
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // 对PizzaStore 来说，并不关心哪一个子类来制作 Pizza
    abstract AbstractPizza createPizza(PizzaType type);

}
