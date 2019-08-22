package com.kay.designpatterns.decorator.template;

/**
 * Created by Kai.L on 8/22/2019
 */
public class ConcreteDecoratorA extends Decorator {
    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void methodA() {
        System.out.println("ConcreteDecoratorA do sth.");
        this.component.methodA();
    }

    @Override
    public void methodB() {
        System.out.println("ConcreteDecoratorB do sth.");
        super.methodB();
    }
}
