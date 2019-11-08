package com.kay.designpatterns.adapter;

/**
 * @author Kai Liu
 * @date 11/8/2019
 **/
public class Adapter implements Target{

    private Adaptee adaptedService;

    public Adapter() {
        this.adaptedService = new AdapteeImpl();
    }

    public Adapter(Adaptee adaptedService) {
        System.out.println("对Adaptee 进行包装");
        this.adaptedService = adaptedService;
    }

    @Override
    public void request() {
        this.adaptedService.specificRequest();
    }

}
