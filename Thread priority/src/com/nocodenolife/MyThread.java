package com.nocodenolife;

public class MyThread extends Thread {

    private int click = 0;

    private volatile boolean running = true;// 循环控制变量

    public MyThread(String name) {

        super(name);
    }

    public int getClick() {

        return click;
    }

    public void run() {

        while (running) {// 一直运行

            click = click + 1;
        }
    }

    public void normalStop() {

        running = false;
    }
}
