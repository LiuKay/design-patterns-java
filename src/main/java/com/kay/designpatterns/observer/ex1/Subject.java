package com.kay.designpatterns.observer.ex1;

/**
 * Subject 相当于一个订阅对象， 作为 Observable, 即可被观察的
 * Created by Kai.L on 8/5/2019
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObserver();

}
