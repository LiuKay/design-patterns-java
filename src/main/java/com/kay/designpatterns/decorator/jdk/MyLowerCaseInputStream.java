package com.kay.designpatterns.decorator.jdk;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Kai.L on 8/22/2019
 */
public class MyLowerCaseInputStream extends FilterInputStream {

    public MyLowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int read = in.read();
        if (read == -1) {
            return -1;
        }
        return Character.toLowerCase((char) read);
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int read = in.read(b, off, len);
        for (int i = off; i < off + read; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return read;
    }
}
