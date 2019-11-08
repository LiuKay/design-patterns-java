package com.kay.designpatterns.singleton;

/**
 * @author Kai Liu
 * @date 11/7/2019
 **/
public class SingletonDoubleCheck {

    // volatile 能确保在该对象被一个线程实例化后，能被其他线程所见
    private volatile static SingletonDoubleCheck instance;

    private SingletonDoubleCheck() {}

    // 由于对象的创建过程并不是原子操作，可能会有其他线程创建了一半的对象，被检测到为null，此时造成的结果便是又生成了不同的实例
    // 故需要在加锁之后，给对象加上 volatile 关键字，并再次检查对象是否为 null
    public static SingletonDoubleCheck getInstance() {
        if (instance == null) {
            // 只有当检测到未实例化时加锁
            synchronized (SingletonDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
