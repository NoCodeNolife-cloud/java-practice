package com.nocodenolife;

public class Main {

    public static void main(String[] args) {

        MyThread myThread1=new MyThread("First Thread");
        MyThread myThread2=new MyThread("Second Thread");

        myThread1.start();
        myThread2.start();

        try{

            myThread1.thread.join();
            myThread2.thread.join();
        }catch (InterruptedException ignored){

        }
    }
}
