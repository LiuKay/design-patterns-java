package com.kay.designpatterns.builder.template;

class Product {

    private String part1;

    private String part2;


    String getPart1() {
        return part1;
    }

    void setPart1(String part1) {
        this.part1 = part1;
    }

    String getPart2() {
        return part2;
    }

    void setPart2(String part2) {
        this.part2 = part2;
    }

    @Override
    public String toString() {
        return "Product{" +
                "part1='" + part1 + '\'' +
                ", part2='" + part2 + '\'' +
                '}';
    }
}
