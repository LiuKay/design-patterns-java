package com.kay.practice.auth;

public interface CredentialStorage {
    String getPasswordByAppId(String appId);
}
