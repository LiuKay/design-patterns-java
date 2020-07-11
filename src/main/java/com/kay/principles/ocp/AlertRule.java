package com.kay.principles.ocp;

import com.kay.principles.ocp.before.ApiInfo;

public class AlertRule {
    public ApiInfo getMatchedRule(String api) {
        return new ApiInfo();
    }
}
