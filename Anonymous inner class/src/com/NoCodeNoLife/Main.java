package com.NoCodeNoLife;

public class Main {

    public static void main(String[] args) {
        run(new MyClass() {
            @Override
            public void func() {
                System.out.println("hello");
            }
        });
    }

    public static void run(MyClass myClass) {
        myClass.func();
    }
}
