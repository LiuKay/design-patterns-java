package com.kay.designpatterns.factory.abstractfactory;

import com.kay.designpatterns.factory.PizzaType;

/**
 * NYPizzaStore 使用  NYPizzaIngredientFactory
 * @author Kai Liu
 * @date 11/1/2019
 **/
class NYPizzaStore extends PizzaStore {

    @Override
    public AbstractPizza createPizza(PizzaType type) {
        NYPizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        AbstractPizza pizza = null;
        switch (type) {
            case CheesePizza:
                pizza = new CheesePizza(ingredientFactory);
                break;
            case VeggiePizza:
                // 其他类似。。。
                pizza = new VeggiePizza(ingredientFactory);
                break;
            default:
                System.err.println("Unknown pizza type.");
                break;
        }
        return pizza;
    }
}
