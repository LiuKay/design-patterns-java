package com.kay.designpatterns.templatemethod;

/**
 * 咖啡因饮料
 */
abstract class CaffeineBeverage {

    final void prepareRecipe() {
        beforeHook();
        boilWater();
        brew();
        pourInCup();
        addCondiments();
        afterHook();
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater() {
        System.out.println("烧水");
    }

    void pourInCup() {
        System.out.println("倒入杯中");
    }

    // 钩子方法
    void beforeHook(){}
    void afterHook(){}

}
