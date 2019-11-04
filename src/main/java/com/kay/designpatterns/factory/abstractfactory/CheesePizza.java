package com.kay.designpatterns.factory.abstractfactory;

/**
 * @author Kai Liu
 * @date 11/4/2019
 **/
public class CheesePizza extends AbstractPizza {

    private AbstractIngredientFactory ingredientFactory;

    public CheesePizza(AbstractIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("CheesePizza prepare");
        this.cheese=ingredientFactory.createCheese();
        this.dough = ingredientFactory.createDough();
        this.sauce = ingredientFactory.createSauce();
    }

}
