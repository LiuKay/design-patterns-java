package com.kay.designpatterns.factory.simplefactory;

import com.kay.designpatterns.factory.PizzaType;

/**
 * 简单工厂， 将创建对象的过程封装到工厂之中，使具体实现与使用解耦
 *
 * PizzaStore 只与 Pizza和Factory 打交道，并不知道具体子类以及如何实例化
 *
 * 解决的问题： Pizza 有不同的种类，如何使用 PizzaStore 提供不同的Pizza, 如何面向接口（Pizza）编程，而不是实现类
 *
 * @author Kai Liu
 * @date 11/1/2019
 **/
class Client {

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();

        PizzaStore store = new PizzaStore(factory);
        store.orderPizza(PizzaType.CheesePizza);
        store.orderPizza(PizzaType.VeggiePizza);
    }

}
