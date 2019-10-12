package com.kay.designpatterns.observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Kai.L on 8/7/2019
 */
class ForecastDisplay implements Observer {

    private float currentPressure = 29.92f;

    private float lastPressure;

    private Observable observable;

    ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure =weatherData.getPressure();
            display();
        }
    }

    private void display() {
        System.out.println("lastPressure:" + lastPressure + ", currentPressure:" + currentPressure);
    }


}
