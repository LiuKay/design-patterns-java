package com.kay.designpatterns.pipeline;

/**
 * 流水线模式
 * Allows processing of data in a series of stages by giving in an initial input and passing the processed output to be used by the next stages.
 * <p>
 * Applicability:
 * Use the Pipeline pattern when you want to
 * <p>
 * Execute individual stages that yields a final value.
 * Add readability to complex sequence of operations by providing a fluent builder as an interface.
 * Improve testability of code since stages will most likely be doing a single thing, complying to the Single Responsibility Principle (SRP)
 *
 * @param <I> 输入类型
 * @param <O> 输出类型
 */
public class Pipeline<I, O> {

    private final Handler<I, O> currentHandler;

    public Pipeline(Handler<I, O> currentHandler) {
        this.currentHandler = currentHandler;
    }

    <K> Pipeline<I, K> addHandler(Handler<O, K> handler) {
        return new Pipeline<>(input -> handler.process(currentHandler.process(input)));
    }

    O execute(I input) {
        return currentHandler.process(input);
    }

}
