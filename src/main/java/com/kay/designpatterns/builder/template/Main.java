package com.kay.designpatterns.builder.template;


/**
 * 建造者模式： 将一个复杂对象的构建与其表示相分离，使得同样的构建过程可以创建不同的表示(实例)。
 */
public class Main {
    public static void main(String[] args) {
        Builder builderA = new AProductBuilder();
        Director.construct(builderA);
        Product product = builderA.build();
        System.out.println(product);

        // 如果要创建新的 Product, 则只需创建新的 Builder 设置好相应的创建步骤，build的组合由 Direct 统一设置（相同的构建过程）
        Builder builderB = new BProductBuilder();
        Director.construct(builderB);
        Product productB = builderB.build();
        System.out.println(productB);
    }
}
