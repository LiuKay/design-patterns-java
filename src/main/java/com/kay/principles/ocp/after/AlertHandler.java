package com.kay.principles.ocp.after;

import com.kay.principles.ocp.AlertRule;
import com.kay.principles.ocp.Notification;

public abstract class AlertHandler {

    protected AlertRule rule;
    protected Notification notification;

    public AlertHandler(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    public abstract void check(ApiStateInfo apiStateInfo);
}
