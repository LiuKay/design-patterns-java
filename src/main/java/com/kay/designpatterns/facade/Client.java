package com.kay.designpatterns.facade;

/**
 * 外观模式
 *
 * @author Kai Liu
 * @date 11/8/2019
 **/
public class Client {
    public static void main(String[] args) {
        Computer facade = new Computer();
        facade.startComputer();
    }
}
