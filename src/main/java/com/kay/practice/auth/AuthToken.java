package com.kay.practice.auth;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Base64;

class AuthToken {

    private static final long DEFAULT_EXPIRED_TIME_INTERVAL =1*60*1000;

    /**
     * base64 wrap SHA-256
     */
    private String token;

    private long createTime;

    private long expiredTimeInterval = DEFAULT_EXPIRED_TIME_INTERVAL;

    public AuthToken(String token, long createTime) {
        this.token = token;
        this.createTime = createTime;
    }

    public AuthToken(String token, long createTime, long expiredTimeInterval) {
        this.token = token;
        this.createTime = createTime;
        this.expiredTimeInterval = expiredTimeInterval;
    }

    public static AuthToken generate(String baseUrl, long createTime, String password, String appId) {
        Charset charset = StandardCharsets.UTF_8;
        String str = baseUrl + createTime + password + appId;
        byte[] bytes = str.getBytes(charset);
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] encode = Base64.getEncoder().encode(digest.digest(bytes));
            return new AuthToken(new String(encode, charset), createTime);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("find algorithm exception.");
        }
    }

    public String getToken() {
        return token;
    }

    public boolean isExpired() {
        LocalDateTime date =
                LocalDateTime.ofInstant(Instant.ofEpochMilli(createTime), ZoneId.systemDefault());
        return LocalDateTime.now().isAfter(date.plusSeconds(expiredTimeInterval));
    }

    public boolean match(AuthToken authToken) {
        return authToken.getToken().equals(this.token);
    }

    //TODO: for test token generating
    public static void main(String[] args) {
        AuthToken authToken = generate("http://localhost/login", 1577777108045l, "123456", "123456");
        System.out.println(authToken.getToken());
    }
}
