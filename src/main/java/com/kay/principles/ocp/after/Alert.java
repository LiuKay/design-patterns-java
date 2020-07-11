package com.kay.principles.ocp.after;

import java.util.ArrayList;
import java.util.List;

class Alert {

    private List<AlertHandler> alertHandlers = new ArrayList<>();

    public void addAlertHandler(AlertHandler handler) {
        this.alertHandlers.add(handler);
    }

    public void check(ApiStateInfo apiStateInfo) {
        for (AlertHandler alertHandler : alertHandlers) {
            alertHandler.check(apiStateInfo);
        }
    }
}
