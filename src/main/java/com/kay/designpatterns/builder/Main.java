package com.kay.designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Product productA = director.getProductA();
        System.out.println(productA.getType());

        Product productB = director.getProductB();
        System.out.println(productB.getType());
    }
}
