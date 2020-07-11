package com.kay.principles.ocp.after;

import com.kay.principles.ocp.AlertRule;
import com.kay.principles.ocp.Notification;

public class ApplicationContext {

    private AlertRule alertRule;
    private Notification notification;
    private Alert alert;

    private void initBeans() {
        alertRule = new AlertRule();
        notification = new Notification();
        alert = new Alert();
        alert.addAlertHandler(new TpsAlertHandler(alertRule,notification));
        alert.addAlertHandler(new ErrorAlertHandler(alertRule,notification));
    }

    public Alert getAlert(){
        return this.alert;
    }

    public static ApplicationContext getInstance() {
        return CONTEXT;
    }

    private static final ApplicationContext CONTEXT = new ApplicationContext();

    private ApplicationContext(){
        CONTEXT.initBeans();
    }
}
