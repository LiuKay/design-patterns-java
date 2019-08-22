package com.kay.designpatterns.decorator.jdk;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Kai.L on 8/22/2019
 */
public class Main {
    public static void main(String[] args) throws IOException {
        String word = "abcd";

        ByteArrayInputStream inputStream = new ByteArrayInputStream(word.getBytes());
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
//        byte[] bytes = new byte[word.getBytes().length];
//        bufferedInputStream.read(bytes);
//        bufferedInputStream.close();
//        String w = new String(bytes);
//        System.out.println(w);

        InputStreamReader reader = new InputStreamReader(bufferedInputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String s = bufferedReader.readLine();
        bufferedReader.close();
        System.out.println(s);


        // test lower case inputStream
        String test = "TEST";
        MyLowerCaseInputStream lowerCaseInputStream = new MyLowerCaseInputStream(new ByteArrayInputStream(test.getBytes()));
        byte[] bytes1 = new byte[test.getBytes().length];
        lowerCaseInputStream.read(bytes1, 0, bytes1.length);
        lowerCaseInputStream.close();
        System.out.println(new String(bytes1));
    }
}
