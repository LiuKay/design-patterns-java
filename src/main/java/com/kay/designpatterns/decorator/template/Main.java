package com.kay.designpatterns.decorator.template;

/**
 * Created by Kai.L on 8/22/2019
 */
public class Main {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA(component);
        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB(decoratorA);
        decoratorB.methodA();
    }
}
