package com.kay.designpatterns.composite;

public class Letter extends LetterComposite {

    private char character;

    public Letter(char character) {
        this.character = character;
    }

    @Override
    protected void printBefore() {
        System.out.print(character);
    }
}
