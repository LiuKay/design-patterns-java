package com.kay.designpatterns.observer.jdk;

/**
 * JDK 中的 观察者模式违背了 面向对象设计原则：
 * 1. 没有面对接口编程，Observable 是一个 Class，
 * 2. setChanged 方法为 protected 只能用子类方式覆盖，不能用组合代替继承的方式扩展
 * Created by Kai.L on 8/6/2019
 */
public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay display = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setStates(22.0f, 40.0f, 120f);
    }
}
