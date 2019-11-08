package com.kay.designpatterns.adapter;

/**
 * @author Kai Liu
 * @date 11/8/2019
 **/
public class AdapteeImpl implements Adaptee {
    @Override
    public void specificRequest() {
        System.out.println("Adaptee 接口方法执行");
    }
}
