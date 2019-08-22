package com.kay.designpatterns.observer.ex1;

/**
 * Created by Kai.L on 8/5/2019
 */
public class StatisticsDisplay implements Observer,Display {

    private Subject weatherData;

    private float temp;
    private float humidity;
    private float pressure;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.humidity = humidity;
        this.temp = temp;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println(String.format("统计信息：温度%s, 湿度%s, 气压%s", temp, humidity, pressure));
    }
}
