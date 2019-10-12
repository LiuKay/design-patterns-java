package com.kay.designpatterns.decorator.template;

/**
 * Created by Kai.L on 8/22/2019
 */
public class Main {
    public static void main(String[] args) {
        AbstractComponent component = new ConcreteComponent();
        ConcreteDecoratorA decoratora = new ConcreteDecoratorA(component);
        ConcreteDecoratorB decoratorb = new ConcreteDecoratorB(decoratora);
        decoratorb.methoda();
    }
}
