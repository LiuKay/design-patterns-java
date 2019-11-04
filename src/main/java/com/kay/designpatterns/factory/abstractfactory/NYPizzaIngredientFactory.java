package com.kay.designpatterns.factory.abstractfactory;

/**
 * 纽约的原料工厂
 * @author Kai Liu
 * @date 11/4/2019
 **/
public class NYPizzaIngredientFactory implements AbstractIngredientFactory {
    @Override
    public Dough createDough() {
        return null;
    }

    @Override
    public Sauce createSauce() {
        return null;
    }

    @Override
    public Cheese createCheese() {
        return null;
    }
}
