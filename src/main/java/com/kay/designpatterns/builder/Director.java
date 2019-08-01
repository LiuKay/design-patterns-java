package com.kay.designpatterns.builder;

/**
 * Builder 模式： 将一个复杂对象的构建与其表示相分离，使得同样的构建过程可以创建不同的表示(实例)。
 */
public class Director {

    private AProductBuilder aProductBuilder = new AProductBuilder();

    private BProductBuilder bProductBuilder = new BProductBuilder();


    Product getProductA() {
        return aProductBuilder.build();
    }

    Product getProductB() {
        return bProductBuilder.build();
    }
}
