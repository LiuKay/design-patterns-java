package com.kay.practice.auth;

public class MysqlCredentialStorage implements CredentialStorage{

    @Override
    public String getPasswordByAppId(String appId) {
        return "123456";
    }
}
