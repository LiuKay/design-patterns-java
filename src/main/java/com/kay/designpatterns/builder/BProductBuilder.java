package com.kay.designpatterns.builder;

public class BProductBuilder implements Builder {
    @Override
    public Product build() {
        return new ProductB();
    }

}
