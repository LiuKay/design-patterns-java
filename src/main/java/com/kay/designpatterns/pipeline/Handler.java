package com.kay.designpatterns.pipeline;

public interface Handler<I, O> {
    O process(I input);
}
