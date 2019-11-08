package com.kay.designpatterns.command.ex1;

/**
 * @author Kai Liu
 * @date 11/8/2019
 **/
class Light {
    Light() {
    }

    void turnOn() {
        System.out.println("The light is on.");
    }

    void turnOff() {
        System.out.println("The light is off.");
    }
}
