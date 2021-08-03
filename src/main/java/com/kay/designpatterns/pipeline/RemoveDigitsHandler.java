package com.kay.designpatterns.pipeline;

public class RemoveDigitsHandler implements Handler<String, String> {
    public String process(String input) {
        return input;
    }
}
