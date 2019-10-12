package com.kay.designpatterns.decorator.template;

/**
 * Created by Kai.L on 8/22/2019
 */
public class Decorator extends AbstractComponent {

    AbstractComponent component;

    public Decorator(AbstractComponent component) {
        this.component = component;
    }

    @Override
    void methoda() {
        this.component.methoda();
    }

    @Override
    void methodb() {
        this.component.methodb();
    }
}
