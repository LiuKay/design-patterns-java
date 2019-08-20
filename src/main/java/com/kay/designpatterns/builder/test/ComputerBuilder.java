package com.kay.designpatterns.builder.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Kai.L on 8/20/2019
 */
public class ComputerBuilder {
    public static final String default_os = "windows";
    public static final String default_browser = "IE";
    public static final String default_chat = "MSN";
    public static final String default_username = "admin";
    public static final String default_pwd = "admin";

    public static final Map<String, List<String>> configMap = new HashMap<>();
    static {
        configMap.put("os", Arrays.asList("windows", "linux"));
        configMap.put("browser", Arrays.asList("IE", "firefox"));
        configMap.put("chat", Arrays.asList("QQ", "MSN"));
    }

    private String os;
    private String username;
    private String password;
    private String chat;
    private String browser;

    public ComputerBuilder() {
        this.os = default_os;
        this.username = default_username;
        this.password = default_pwd;
        this.chat = default_chat;
        this.browser = default_browser;
    }

    private String getConfigKey(String suffix) {
        return "default_" + suffix;
    }

    public String getOs() {
        return os;
    }

    public ComputerBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public ComputerBuilder setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public ComputerBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getChat() {
        return chat;
    }

    public ComputerBuilder setChat(String chat) {
        this.chat = chat;
        return this;
    }

    public String getBrowser() {
        return browser;
    }

    public ComputerBuilder setBrowser(String browser) {
        this.browser = browser;
        return this;
    }
}
