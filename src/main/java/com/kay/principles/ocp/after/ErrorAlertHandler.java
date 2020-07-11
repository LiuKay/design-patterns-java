package com.kay.principles.ocp.after;

import com.kay.principles.ocp.AlertRule;
import com.kay.principles.ocp.Notification;
import com.kay.principles.ocp.NotificationEmergencyLevel;

public class ErrorAlertHandler extends AlertHandler {
    public ErrorAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStateInfo apiStateInfo) {
        if (apiStateInfo.getErrorCount() > rule.getMatchedRule(apiStateInfo.getApi()).getMaxErrorCount()) {
            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
        }
    }
}
