package com.martse;


import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Util util = new Util();
        Thread t1 = new Thread(util::writeAlphabet);
        Thread t2 = new Thread(util::writeAlphabet);
        Thread t3 = new Thread(util::writeAlphabet);
        t1.start();
        t2.start();
        t3.start();

    }
}
