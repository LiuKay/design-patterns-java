package com.kay.designpatterns.singleton;

/**
 * "饿汉式"单例
 * @author Kai Liu
 * @date 11/7/2019
 **/
public class SingletonEagerly {

    // 初始化时便创建对象
    private static SingletonEagerly instance = new SingletonEagerly();

    private SingletonEagerly() {}

    public static SingletonEagerly getInstance() {
        return instance;
    }
}
