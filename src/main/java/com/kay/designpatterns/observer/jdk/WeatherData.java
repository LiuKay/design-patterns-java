package com.kay.designpatterns.observer.jdk;

import java.util.Observable;

/**
 * Created by Kai.L on 8/6/2019
 */
class WeatherData extends Observable {

    // 温度
    private float temperature;
    // 湿度
    private float humidity;
    // 气压
    private float pressure;

    private void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    void setStates(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        this.measurementsChanged();
    }

    float getTemperature() {
        return temperature;
    }

    float getHumidity() {
        return humidity;
    }

    float getPressure() {
        return pressure;
    }
}
