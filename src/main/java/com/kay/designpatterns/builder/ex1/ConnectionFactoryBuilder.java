package com.kay.designpatterns.builder.ex1;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

/**
 * Created by Kai.L on 8/22/2019
 */
public class ConnectionFactoryBuilder {

    private BasicDataSource dataSource;

    private ConnectionFactoryBuilder() {
        dataSource = new BasicDataSource();
    }

    public static ConnectionFactoryBuilder builder() {
        return new ConnectionFactoryBuilder();
    }

    public ConnectionFactory build() {
        return new ConnectionFactory(dataSource);
    }

    public ConnectionFactoryBuilder setDriverClassName(String driverClassName) {
        dataSource.setDriverClassName(driverClassName);
        return this;
    }

    public ConnectionFactoryBuilder setPassword(String password) {
        this.dataSource.setPassword(password);
        return this;
    }

    public ConnectionFactoryBuilder setUrl(String url) {
        this.dataSource.setUrl(url);
        return this;
    }

    public ConnectionFactoryBuilder setUsername(String username) {
        this.dataSource.setUsername(username);
        return this;
    }

    static class ConnectionFactory{

        private DataSource dataSource;

        private ConnectionFactory(DataSource dataSource) {
            this.dataSource = dataSource;
        }

        Connection getConnection() throws SQLException {
            return dataSource.getConnection();
        }

        public DataSource getDataSource() {
            return dataSource;
        }

        public void setDataSource(DataSource dataSource) {
            this.dataSource = dataSource;
        }
    }



}
