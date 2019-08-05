package com.kay.designpatterns.observer;

/**
 * 观察者接口
 * Created by Kai.L on 8/5/2019
 */
public interface Observer {

    void update(float temp,float humidity,float pressure);
}
