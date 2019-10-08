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

    public ConnectionFactoryImpl build() {
        return new ConnectionFactoryImpl(dataSource);
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

    /**
     * This class is transparent for the client.
     */
    private static class ConnectionFactoryImpl implements ConnectionFactory {

        private DataSource dataSource;

        private ConnectionFactoryImpl(DataSource dataSource) {
            this.dataSource = dataSource;
        }

        public Connection getConnection() throws SQLException {
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
