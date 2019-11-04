package com.kay.designpatterns.factory.abstractfactory;

/**
 * @author Kai Liu
 * @date 11/1/2019
 **/
abstract class AbstractPizza {
    Dough  dough;
    Sauce sauce;
    Cheese cheese;

    // 准备
    abstract void prepare();

    // 烘烤
    void bake(){
        System.out.println("Pizza bake");
    }

    // 切块
    void cut(){
        System.out.println("Pizza cut");
    }

    // 包装
    void box(){
        System.out.println("Pizza box");
    }
}
