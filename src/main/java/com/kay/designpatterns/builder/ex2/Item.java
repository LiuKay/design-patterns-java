package com.kay.designpatterns.builder.ex2;

/**
 * @author kay
 * @date 2019/10/13
 */
public interface Item {

    /**
     * @return 项目名称
     */
    String name();

    /**
     * @return 游玩时间
     */
    String getDuration();

    /**
     * @return 每个项目的价钱
     */
    Double getPrice();

    // others
}
