package com.nocodenolife;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // 线程
        MyThread myThread1 = new MyThread("myThread1");
        MyThread myThread2 = new MyThread("myThread2");

        // 设置优先级
        myThread1.setPriority(Thread.NORM_PRIORITY - 2);
        myThread2.setPriority(Thread.NORM_PRIORITY + 2);

        // 线程开始运行
        myThread1.start();
        myThread2.start();

        Thread.sleep(1000);// 等待1秒

        // 结束两个线程
        myThread1.normalStop();
        myThread2.normalStop();

        myThread1.join();
        myThread2.join();

        System.out.println("myThread1的循环次数为: " + myThread1.getClick());
        System.out.println("myThread2的循环次数为: " + myThread2.getClick());
    }
}
