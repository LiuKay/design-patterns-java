package com.kay.designpatterns.builder.template;

public interface Builder {

    void setPart1();

    void setPart2();

    Product build();
}
