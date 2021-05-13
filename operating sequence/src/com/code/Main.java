package com.code;

public class Main {

    public static void main(String[] args) {

        int a;
        int b;
        a = b = 5;

        a++;
        b--;

        System.out.println("a=" + a + " b=" + b);
        System.out.println(a + "/" + b + " = " + (a * 1.0) / (b * 1.0));
        System.out.println(a + "/" + b + " = " + a / b);
    }
}
