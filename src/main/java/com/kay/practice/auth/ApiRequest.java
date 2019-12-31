package com.kay.practice.auth;

import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;

public class ApiRequest {
    public static final String TOKEN_PARAM = "token";
    public static final String APP_ID_PARAM = "appId";
    public static final String TIMESTAMP_PARAM = "timestamp";

    private String baseUrl;
    private String token;
    private String appId;
    private long timestamp;

    public ApiRequest(String baseUrl, String token, String appId, long timestamp) {
        this.baseUrl = baseUrl;
        this.token = token;
        this.appId = appId;
        this.timestamp = timestamp;
    }

    public static ApiRequest createFromFullUrl(String url) {
        // if url is encoded, then
//        String decode;
//        try {
//            decode = URLDecoder.decode(url, "utf-8");
//        } catch (UnsupportedEncodingException e) {
//            throw new RuntimeException(e.getMessage(), e);
//        }
        String baseUrl = StringUtils.substringBefore(url, "?");
        String params = StringUtils.substringAfter(url, "?");
        String[] split = params.split("&");
        Map<String, String> map = new HashMap<>();
        for (String param : split) {
            String[] keyValue = param.split("=",2);
            map.put(keyValue[0], keyValue[1]);
        }

        String token = map.get(TOKEN_PARAM);
        String appId = map.get(APP_ID_PARAM);
        String timestamp = map.get(TIMESTAMP_PARAM);
        return new ApiRequest(baseUrl, token, appId, Long.valueOf(timestamp));
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public String getToken() {
        return token;
    }

    public String getAppId() {
        return appId;
    }

    public long getTimestamp() {
        return timestamp;
    }
}
