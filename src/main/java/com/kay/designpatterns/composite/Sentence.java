package com.kay.designpatterns.composite;

import java.util.List;

public class Sentence extends LetterComposite {
    public Sentence(List<Word> words) {
        words.forEach(this::add);
    }

    @Override
    protected void printAfter() {
        System.out.print(".");
    }
}
