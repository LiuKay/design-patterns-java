package com.kay.designpatterns.decorator.template;

/**
 * Created by Kai.L on 8/22/2019
 */
public class ConcreteComponent extends Component {
    @Override
    public void methodA() {
        System.out.println("concrete mA");
    }

    @Override
    public void methodB() {
        System.out.println("concrete mB");
    }
}
