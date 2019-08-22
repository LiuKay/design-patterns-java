package com.kay.designpatterns.decorator.ex1;

/**
 * 每种饮品都会加的调味品，故设计成 Decorator ，可以叠加
 * Created by Kai.L on 8/14/2019
 */
public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();

}
