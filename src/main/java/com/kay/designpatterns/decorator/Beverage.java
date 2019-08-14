package com.kay.designpatterns.decorator;

/**
 * 饮品基类
 * Created by Kai.L on 8/14/2019
 */
public abstract class Beverage {

    private String description = "Unknown Beverage";

    public abstract double cost();

    public String getDescription(){
        return this.description;
    }

}
