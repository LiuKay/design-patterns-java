package com.kay.practice.auth;

public class Client {
    public static void main(String[] args) {
        String requestUrl = "http://localhost/login" +
                "?token=1DTSyqpKUPO8FECSv6uHjSwFNMNcxez1DzBiI4JFJhE=" +
                "&appId=123456" +
                "&timestamp=1577777108045";

        ApiAuthenticator apiAuthenticator = new DefaultApiAuthenticator();
        apiAuthenticator.auth(requestUrl);
    }
}
