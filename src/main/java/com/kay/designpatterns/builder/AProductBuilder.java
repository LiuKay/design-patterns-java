package com.kay.designpatterns.builder;

public class AProductBuilder implements Builder {

    Product product = new Product();

    @Override
    public void setPart1() {
        product.setPart1("A产品part1");
    }

    @Override
    public void setPart2() {
        product.setPart2("A产品part2");
    }

    @Override
    public Product build() {
        return this.product;
    }

}
