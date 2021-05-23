package com.nocodenolife;

public class MyThread implements Runnable {

    private static int counter;

    public Thread thread;

    public MyThread(String string) {

        thread = new Thread(this, string);
    }

    public void start() {

        thread.start();
    }

    public void run() {

        for (int i = 0; i < 100; ++i) {

            counter=counter+1;
            System.out.println("My name is " + thread.getName() + " count= " + counter);
            try{

                thread.sleep(10);
            }catch (InterruptedException ignored){

            }
        }
    }
}
