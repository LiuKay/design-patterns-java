package com.kay.designpatterns.composite;

public class Client {
    public static void main(String[] args) {
        Message message = new Message();

        message.messageForOrcs().print();
        System.out.println();
        message.messageFromElves().print();
    }
}
