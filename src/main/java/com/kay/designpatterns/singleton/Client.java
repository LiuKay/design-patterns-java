package com.kay.designpatterns.singleton;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Kai Liu
 * @date 11/7/2019
 **/
public class Client {

    public static void main(String[] args) {
        testNotSameInstance();
    }

    /**
     *  <b>出现了不同的实例</b>
     * com.kay.designpatterns.singleton.Singleton@358b5609
     * com.kay.designpatterns.singleton.Singleton@358b5609
     * com.kay.designpatterns.singleton.Singleton@358b5609
     * com.kay.designpatterns.singleton.Singleton@358b5609
     * com.kay.designpatterns.singleton.Singleton@358b5609
     * com.kay.designpatterns.singleton.Singleton@358b5609
     * com.kay.designpatterns.singleton.Singleton@b6cf8c
     * com.kay.designpatterns.singleton.Singleton@358b5609
     * com.kay.designpatterns.singleton.Singleton@2caa9bf8
     * com.kay.designpatterns.singleton.Singleton@358b5609
     */
    private static void testNotSameInstance() {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            executor.execute(() -> System.out.println(SingletonNotLock.getInstance().toString()));
        }
        executor.shutdown();
    }

}
