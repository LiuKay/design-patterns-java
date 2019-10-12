package com.kay.designpatterns.builder.ex1;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.apache.commons.dbcp2.BasicDataSource;

/**
 * Created by Kai.L on 8/22/2019
 */
public class Main {
    public static void main(String[] args) throws Exception {

        //****************** normal
        BasicDataSource dataSource = new BasicDataSource();
        // set properties
        Connection connection = dataSource.getConnection();
        // use connection
        //*******************

        // builder + factory interface
        // ConnectionFactoryImpl 对客户端来说是透明的，使用者只需关心接口方法而已，无需关心实现细节
        ConnectionFactory connectionFactory = DefaultConnectionFactoryBuilder.builder()
                .setUrl("XXX")
                .setUsername("root")
                .setPassword("root")
                .setDriverClassName(
                        "com.mysql.jdbc.Driver")
                .build();

        Connection newConn = connectionFactory.getConnection();
        // do some things with newConn

    }
}
