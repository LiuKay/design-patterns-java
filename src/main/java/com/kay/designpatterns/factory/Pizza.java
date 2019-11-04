package com.kay.designpatterns.factory;

/**
 * @author Kai Liu
 * @date 11/1/2019
 **/
public interface Pizza {

    // 准备
    void prepare();

    // 烘烤
    void bake();

    // 切块
    void cut();

    // 包装
    void box();
}
