package com.kay.designpatterns.factory.simplefactory;

/**
 * 简单工厂， 将创建对象的过程封装到工厂之中，使具体实现与使用解耦
 *
 * PizzaStore 只与 Pizza和Factory 打交道，并不知道具体子类以及如何实例化
 *
 * 封装的变化：对象可能会修改为其他子类
 *
 * @author Kai Liu
 * @date 11/1/2019
 **/
class Main {

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();

        PizzaStore store = new PizzaStore(factory);
        store.orderPizza("CheesePizza");
        store.orderPizza("VeggiePizza");
    }

}
