package com.kay.designpatterns.decorator.ex1;

/**
 * 饮品基类
 * Created by Kai.L on 8/14/2019
 */
abstract class AbstractBeverage {

    private static final String description = "Unknown Beverage";
    private Size size = Size.TALL;

    public String getDescription(){
        return description;
    }

    public abstract double cost();

    Size getSize() {
        return this.size;
    }

    void setSize(Size size) {
        this.size = size;
    }

    enum Size {
        /**
         * TALL
         */
        TALL,
        /**
         * GRANDE
         */
        GRANDE,
        /**
         * VENTI
         */
        VENTI
    }
}
