package com.kay.designpatterns.decorator.template;

/**
 * Created by Kai.L on 8/22/2019
 */
class ConcreteDecoratorA extends Decorator {
    ConcreteDecoratorA(AbstractComponent component) {
        super(component);
    }

    @Override
    public void methoda() {
        System.out.println("ConcreteDecoratorA do sth.");
        this.component.methoda();
    }

    @Override
    public void methodb() {
        System.out.println("ConcreteDecoratorB do sth.");
        super.methodb();
    }
}
