package com.kay.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气数据收集器类似于一个状态管理器
 * Created by Kai.L on 8/5/2019
 */
public class WeatherData implements Subject{

    private List<Observer> observers = new ArrayList<>();

    private float temperature; // 温度
    private float humidity;  // 湿度
    private float pressure; // 气压

    @Override
    public void registerObserver(Observer observer) {
        if (!this.observers.contains(observer)) {
            this.observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        this.observers.forEach(observer -> observer.update(temperature, humidity, pressure));
    }

    /**
     * 当状态改变时自动触发此方法
     */
    public void measurementsChanged() {
        this.notifyObserver();
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

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        this.measurementsChanged();
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
        this.measurementsChanged();
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
        this.measurementsChanged();
    }
}
