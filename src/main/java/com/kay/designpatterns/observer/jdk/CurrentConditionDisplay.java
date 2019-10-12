package com.kay.designpatterns.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Kai.L on 8/6/2019
 */
class CurrentConditionDisplay implements Observer {

    private float temperature;
    private float humidity;

    private Observable observable;

    CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    private void display() {
        System.out.println(String.format("当前天气情况：温度%s度, 湿度%s", this.temperature, this.humidity));
    }
}
