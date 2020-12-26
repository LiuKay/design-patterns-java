package com.kay.designpatterns.state;

/**
 * 状态模式接口类
 *
 * @author kay
 * @date 2020/12/26
 */
interface State {
    void insertQuarter();//投硬币

    void ejectQuarter();//退硬币

    void turnCrank();//转动摇手

    void dispense();//派发糖果
}
