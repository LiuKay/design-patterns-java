package com.kay.designpatterns.decorator.ex1;

/**
 * 模拟场景： Beverage饮品类下有不同的饮料类型，每种饮料都会添加不同配料 Condiment，这些配料可以任意搭配。
 * 如何设计可以在不改变原 CODE 的情况下，添加新的饮品和调味品？ 如果饮料要加双倍配料呢？
 *
 * Created by Kai.L on 8/14/2019
 */
public class Main {
    public static void main(String[] args) {
        AbstractBeverage espresso = new Mocha(new Espresso());
        System.out.println(espresso.getDescription() + ", cost:" + espresso.cost());

        AbstractBeverage mocha2 = new Mocha(new Mocha(new Espresso()));
        System.out.println(mocha2.getDescription() + ", cost:" + mocha2.cost());


        AbstractBeverage milkMochaCoffee = new Milk(new Espresso());
        System.out.println(milkMochaCoffee.getDescription() + ", cost:" + milkMochaCoffee.cost());
    }
}
