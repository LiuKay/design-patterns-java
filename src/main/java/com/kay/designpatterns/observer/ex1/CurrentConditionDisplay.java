package com.kay.designpatterns.observer.ex1;

/**
 * Created by Kai.L on 8/5/2019
 */
public class CurrentConditionDisplay implements Observer,Display {

    // 订阅对象
    private Subject subject;

    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println(String.format("当前天气情况：温度%s度, 湿度%s", this.temperature, this.humidity));
    }
}
