package com.kay.designpatterns.observer;

/**
 * 主题接口
 * Created by Kai.L on 8/5/2019
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();

}
