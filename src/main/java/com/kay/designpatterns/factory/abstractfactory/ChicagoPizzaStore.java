package com.kay.designpatterns.factory.abstractfactory;

import com.kay.designpatterns.factory.PizzaType;

/**
 *
 * ChicagoPizzaStore 使用 PizzaIngredientFactory
 *
 * @author Kai Liu
 * @date 11/1/2019
 **/
class ChicagoPizzaStore extends PizzaStore {

    @Override
    public AbstractPizza createPizza(PizzaType type) {
        AbstractIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        System.out.println("ChicagoPizzaFactory create pizza...");
        AbstractPizza pizza = null;
        switch (type) {
            case CheesePizza:
                pizza = new CheesePizza(pizzaIngredientFactory);
                break;
            case VeggiePizza:
                // 其他类似。。。
                pizza = new VeggiePizza(pizzaIngredientFactory);
                break;
            default:
                System.err.println("Unknown pizza type.");
                break;
        }
        return pizza;
    }

}
