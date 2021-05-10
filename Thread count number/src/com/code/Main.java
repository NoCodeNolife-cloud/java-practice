package com.code;

public class Main {

    public static void main(String[] args) {

        Thread thread1 = new Thread(new CountNumber());
        thread1.start();

        Thread thread2 = new Thread(new CountNumber());
        thread2.start();
    }
}
