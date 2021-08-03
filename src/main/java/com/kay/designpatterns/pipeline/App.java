package com.kay.designpatterns.pipeline;

public class App {
    public static void main(String[] args) {
        Pipeline pipeline = new Pipeline(new RemoveAlphabetsHandler())
                .addHandler(new RemoveDigitsHandler())
                .addHandler(new ConvertToCharArrayHandler());
        Object result = pipeline.execute("abcDSK213!");

        System.out.println(result);
    }
}
