package com.kay.designpatterns.factory.factorymethod;

import com.kay.designpatterns.factory.Pizza;
import com.kay.designpatterns.factory.PizzaType;

/**
 * @author Kai Liu
 * @date 11/4/2019
 **/
abstract class PizzaStore {

    final Pizza orderPizza(PizzaType type) {
        Pizza pizza;

        // createPizza方法从原来的工厂对象中转移到 PizzaStore
        pizza = createPizza(type);

        // 无变化的业务
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    // 对PizzaStore 来说，并不关心哪一个子类来制作 Pizza
    abstract Pizza createPizza(PizzaType type);

}
