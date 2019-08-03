package com.kay.designpatterns.builder;

public interface Builder {

    void setPart1();

    void setPart2();

    Product build();
}
