package com.kay.designpatterns.singleton;

/**
 * @author Kai Liu
 * @date 11/7/2019
 **/
public class SingletonNotLock {

    private static SingletonNotLock instance;

    private SingletonNotLock() {}

    public static SingletonNotLock getInstance() {
        if (instance == null) {
            // 当多个线程同时到达此处时，会产生不同的对象实例
            instance = new SingletonNotLock();
        }
        return instance;
    }

}
