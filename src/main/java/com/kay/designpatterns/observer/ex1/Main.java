package com.kay.designpatterns.observer.ex1;

/**
 * The Observer Pattern defines a one-to-many dependency between objects so that when one object changes state,
 *  all of its dependents are notified and updated automatically.
 *
 *  观察者模式定义了一种对多的关系，当被观察的状态改变时，所有依赖者都将收到通知并做出相应的反应。
 *  将依赖关系 loose coupling 解耦，增加可扩展性。
 *
 *  1. 可以随时添加新的 Observer 时，无需修改 Subject
 *  2. Subject 无需知道观察者实现细节，只知道 Observer 接口
 *  3. Subject 与 Observer 互相独立
 *
 *   Created by Kai.L on 8/5/2019
 */
public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        // Register weatherData to the following three Observers.
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setStates(23.0f, 30.0f, 100.0f);
    }
}
