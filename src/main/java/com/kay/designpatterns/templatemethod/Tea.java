package com.kay.designpatterns.templatemethod;

class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("侵泡茶叶");
    }

    @Override
    void addCondiments() {
        System.out.println("加点柠檬");
    }
}
