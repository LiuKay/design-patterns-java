package com.kay.designpatterns.decorator.template;

/**
 * Created by Kai.L on 8/22/2019
 */
public class ConcreteDecoratorB extends Decorator {
    ConcreteDecoratorB(AbstractComponent component) {
        super(component);
    }

    @Override
    public void methoda() {
        // do sth.
        System.out.println("DecoratorB do sth. with methodA.");
        this.component.methoda();
    }

    @Override
    public void methodb() {
        System.out.println("DecoratorB do sth. with methodB.");
        this.component.methodb();
    }
}
