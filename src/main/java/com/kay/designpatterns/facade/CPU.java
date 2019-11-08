package com.kay.designpatterns.facade;

/**
 * @author Kai Liu
 * @date 11/8/2019
 **/
public class CPU {
    public void freeze() {
        System.out.println("CPU freeze..");
        //..
    }

    public void jump(long position) { //...
        System.out.println("CPU jump..");

    }

    public void execute() { //...
        System.out.println("CPU execute..");

    }

}
