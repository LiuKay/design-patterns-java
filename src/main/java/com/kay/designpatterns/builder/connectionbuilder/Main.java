package com.kay.designpatterns.builder.connectionbuilder;

import java.sql.Connection;
import java.sql.PreparedStatement;
import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.commons.dbcp2.DataSourceConnectionFactory;

/**
 * Created by Kai.L on 8/22/2019
 */
public class Main {
    public static void main(String[] args) throws Exception {

        //****************** normal
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("");
        dataSource.setPassword("");
        dataSource.setUrl("");
        dataSource.setUsername("");
        Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("");
        preparedStatement.execute();
        connection.close();
        dataSource.close();
        //*******************

        // builder + factory
        ConnectionFactoryBuilder.ConnectionFactory connectionFactory = ConnectionFactoryBuilder.builder()
                                                                                   .setUrl("XXX")
                                                                                   .setUsername("root")
                                                                                   .setPassword("root")
                                                                                   .setDriverClassName(
                                                                                           "com.mysql.jdbc.Driver")
                                                                                   .build();
        Connection newConn = connectionFactory.getConnection();
        // do some things.


//        BasicDataSourceFactory dataSourceFactory = new BasicDataSourceFactory();
//        BasicDataSource xx = BasicDataSourceFactory.createDataSource(new Properties());
        DataSourceConnectionFactory factory = new DataSourceConnectionFactory(new BasicDataSource());
        Connection connection1 = factory.createConnection();
    }
}
