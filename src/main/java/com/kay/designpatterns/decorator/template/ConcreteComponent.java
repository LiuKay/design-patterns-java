package com.kay.designpatterns.decorator.template;

/**
 * Created by Kai.L on 8/22/2019
 */
class ConcreteComponent extends AbstractComponent {
    @Override
    void methoda() {
        System.out.println("concrete mA");
    }

    @Override
    void methodb() {
        System.out.println("concrete mB");
    }
}
