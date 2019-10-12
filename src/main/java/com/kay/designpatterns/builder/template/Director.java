package com.kay.designpatterns.builder.template;


class Director {

    static void construct(Builder builder) {
        builder.setPart1();
        builder.setPart2();
    }
}
