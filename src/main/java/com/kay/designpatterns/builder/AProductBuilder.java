package com.kay.designpatterns.builder;

public class AProductBuilder implements Builder {
    @Override
    public Product build() {
        return new ProductA();
    }

}
