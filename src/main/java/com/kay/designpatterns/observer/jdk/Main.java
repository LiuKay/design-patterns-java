package com.kay.designpatterns.observer.jdk;

/**
 * Created by Kai.L on 8/6/2019
 */
public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay display = new CurrentConditionDisplay(weatherData);

        weatherData.setStates(22.0f, 40.0f, 120f);
    }
}
