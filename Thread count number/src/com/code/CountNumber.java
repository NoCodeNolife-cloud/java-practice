package com.code;

public class CountNumber implements Runnable {

    private int number = 0;

    public synchronized void run() {

        for (int i = 0; i < 10; ++i) {

            ++number;
            System.out.println(Thread.currentThread().getName() + " number = " + number);

            try {

                Thread.sleep(100);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " finish");
    }
}
