package com.kay.designpatterns.factory.abstractfactory;

/**
 * 原料工厂 作为 抽象工厂
 * @author Kai Liu
 * @date 11/4/2019
 **/
public interface AbstractIngredientFactory {

    // 生产面团
    Dough createDough();

    // 生产酱
    Sauce createSauce();

    // 生产奶酪
    Cheese createCheese();

}
