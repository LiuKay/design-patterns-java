package com.kay.designpatterns.builder.template;


/**
 * 建造者模式： 将一个复杂对象的构建与其表示相分离，使得同样的构建过程可以创建不同的表示(实例)。
 */
class Main {
    public static void main(String[] args) {
        Builder buildera = new ProductBuilderA();
        Director.construct(buildera);
        Product product = buildera.build();
        System.out.println(product);

        // 如果要创建新的 Product, 则只需创建新的 Builder 设置好相应的创建步骤，build的组合由 Direct 统一设置（相同的构建过程）
        Builder builderb = new ProductBuilderB();
        Director.construct(builderb);
        Product productb = builderb.build();
        System.out.println(productb);
    }
}
