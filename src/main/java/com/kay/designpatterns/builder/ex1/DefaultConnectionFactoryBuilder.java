package com.kay.designpatterns.builder.ex1;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Objects;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

/**
 * @author kay
 */
public class DefaultConnectionFactoryBuilder {

    private BasicDataSource dataSource;
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    private DefaultConnectionFactoryBuilder() {
    }

    public static DefaultConnectionFactoryBuilder builder() {
        return new DefaultConnectionFactoryBuilder();
    }

    ConnectionFactory build() {
        if (dataSource == null) {
            dataSource = new BasicDataSource();
        }
        dataSource.setDriverClassName(driverClassName);
        dataSource.setPassword(password);
        dataSource.setUsername(username);
        dataSource.setUrl(url);
        return new ConnectionFactoryImpl(dataSource);
    }

    void setDataSource(BasicDataSource dataSource) {
        this.dataSource = dataSource;
    }

    DefaultConnectionFactoryBuilder setDriverClassName(String driverClassName) {
        Objects.requireNonNull(driverClassName, "driverClassName can not be null");
        this.driverClassName = driverClassName;
        return this;
    }

    DefaultConnectionFactoryBuilder setPassword(String password) {
        Objects.requireNonNull(password, "password can not be null");
        this.password = password;
        return this;
    }

    DefaultConnectionFactoryBuilder setUrl(String url) {
        Objects.requireNonNull(url, "url can not be null");
        this.url = url;
        return this;
    }

    DefaultConnectionFactoryBuilder setUsername(String username) {
        Objects.requireNonNull(username, "username can not be null");
        this.username = username;
        return this;
    }

    /**
     * This class is transparent for the client.
     */
    private static class ConnectionFactoryImpl implements ConnectionFactory {

        private DataSource dataSource;

        private ConnectionFactoryImpl(DataSource dataSource) {
            this.dataSource = dataSource;
        }

        @Override
        public Connection getConnection() throws SQLException {
            return dataSource.getConnection();
        }

    }
}
