package com.kay.designpatterns.observer.ex1;

/**
 * 观察者接口
 * Created by Kai.L on 8/5/2019
 */
interface Observer {

    /**
     * Once Observable object has changed, this method will invoke.
     *
     * @param temp     气温
     * @param humidity 湿度
     * @param pressure 气压
     */
    void update(float temp, float humidity, float pressure);
}
