package com.kay.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class LetterComposite {

    private List<LetterComposite> children = new ArrayList<>();

    public void add(LetterComposite letter){
        this.children.add(letter);
    }

    public int count(){
        return this.children.size();
    }

    protected void printBefore(){

    }

    protected void printAfter(){

    }

    public void print(){
        printBefore();
        this.children.forEach(LetterComposite::print);
        printAfter();
    }

}

