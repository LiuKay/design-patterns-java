package com.kay.designpatterns.decorator.template;

/**
 * Created by Kai.L on 8/22/2019
 */
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void methodA() {
        // do sth.
        System.out.println("DecoratorB do sth. with methodA.");
        this.component.methodA();
    }

    @Override
    public void methodB() {
        System.out.println("DecoratorB do sth. with methodB.");
        this.component.methodB();
    }
}
