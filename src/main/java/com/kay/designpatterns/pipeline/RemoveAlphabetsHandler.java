package com.kay.designpatterns.pipeline;

import org.apache.commons.lang3.RegExUtils;

public class RemoveAlphabetsHandler implements Handler<String, String> {

    public String process(String input) {
        return RegExUtils.removeAll(input, "[0-9a-zA-Z_]");
    }
}
