package com.kay.designpatterns.observer;

/**
 * Created by Kai.L on 8/5/2019
 */
public class ForecastDisplay implements Observer,Display {

    private Subject weatherData;

    private float temp;

    public ForecastDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp + 1.2f;
        display();
    }

    @Override
    public void display() {
        System.out.println("预测明天气温为：" + temp);
    }
}
