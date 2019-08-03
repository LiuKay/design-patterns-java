package com.kay.designpatterns.builder;


public class Director {

    public static void construct(Builder builder) {
        builder.setPart1();
        builder.setPart2();
    }
}
