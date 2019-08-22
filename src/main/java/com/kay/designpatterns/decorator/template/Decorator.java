package com.kay.designpatterns.decorator.template;

/**
 * Created by Kai.L on 8/22/2019
 */
public class Decorator extends Component {

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void methodA() {
        this.component.methodA();
    }

    @Override
    public void methodB() {
        this.component.methodB();
    }
}
