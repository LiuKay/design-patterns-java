package com.kay.designpatterns.observer.jdk;

import java.util.Observable;

/**
 * Created by Kai.L on 8/6/2019
 */
public class WeatherData extends Observable {

    private float temperature; // 温度
    private float humidity;  // 湿度
    private float pressure; // 气压

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setStates(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
