package com.kay.designpatterns.templatemethod;

public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("沸水冲泡咖啡");
    }

    @Override
    void addCondiments() {
        System.out.println("加糖和牛奶");
    }
}
