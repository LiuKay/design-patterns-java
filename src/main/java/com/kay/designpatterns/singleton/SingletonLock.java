package com.kay.designpatterns.singleton;

/**
 * @author Kai Liu
 * @date 11/7/2019
 **/
public class SingletonLock {

    private static SingletonLock instance;

    private SingletonLock() {}

    // 每次获取都要加锁，对性能敏感
    public static synchronized SingletonLock getInstance() {
        if (instance == null) {
            instance = new SingletonLock();
        }
        return instance;
    }
}
