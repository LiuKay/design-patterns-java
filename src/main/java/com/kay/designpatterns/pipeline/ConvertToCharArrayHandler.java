package com.kay.designpatterns.pipeline;

public class ConvertToCharArrayHandler implements Handler<String, char[]> {
    public char[] process(String input) {
        return input.toCharArray();
    }
}
