package com.kay.designpatterns.strategy;

import com.kay.designpatterns.strategy.ex1.AbstractDuck;
import com.kay.designpatterns.strategy.ex1.ModelDuck;

/**
 * NOTE: Program to an interface, not an implementation.
 *
 *
 * The Strategy Pattern defines a family of algorithms, encapsulates each one, and
 * makes them interchangeable. Strategy lets the algorithm vary independently from
 * clients that use it.
 *
 *
 * Created by Kai.L on 8/28/2019
 */
public class Client {
    public static void main(String[] args) {
        AbstractDuck model = new ModelDuck();
        model.swim();
        model.fly();
        model.quack();
        model.description();
    }
}
