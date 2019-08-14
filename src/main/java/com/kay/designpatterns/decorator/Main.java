package com.kay.designpatterns.decorator;

/**
 * Decorator Pattern: attaches additional responsibilities to an object dynamically.
 * Decorators provide a flexible alternative to subclassing for extending functionality.
 *
 * 装饰器模式
 * 组合优于继承，通过组合的方式扩展原有接口的功能。
 *
 * 模拟场景： Beverage饮品类下有不同的饮料类型，每种饮料都会添加不同配料 Condiment，这些配料可以任意搭配。
 * 如何设计可以在不改变原 CODE 的情况下，添加新的饮品和调味品？ 如果饮料要加双倍配料呢？
 *
 * Created by Kai.L on 8/14/2019
 */
public class Main {
    public static void main(String[] args) {
        Mocha mocha = new Mocha(new Espresso());
        System.out.println(mocha.getDescription() + ", cost:" + mocha.cost());

        Mocha mocha2 = new Mocha(mocha);
        System.out.println(mocha2.getDescription() + ", cost:" + mocha2.cost());


        Milk milkMochaCoffee = new Milk(mocha);
        System.out.println(milkMochaCoffee.getDescription() + ", cost:" + milkMochaCoffee.cost());
    }
}
