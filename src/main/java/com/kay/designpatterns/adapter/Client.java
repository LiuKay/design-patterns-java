package com.kay.designpatterns.adapter;

/**
 * @author Kai Liu
 * @date 11/8/2019
 **/
public class Client {

    // 现在需要 Target 接口，但是 Adaptee 接口不兼容 Target接口，此时 Adapter 的作用就是帮助 Adaptee转换为 Target
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }

}
