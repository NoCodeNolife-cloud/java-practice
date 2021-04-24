package com.code;

public class Main {

    public static void main(String[] args) {
        System.out.print(args[0]);
        System.out.println((args[1]));
        System.out.printf("%s", args[2]).println();
        int i = 123;
        System.out.printf("%d\n", i);
        double d = 123.456;
        System.out.printf("%f%n", d);
        System.out.printf("%5.2f", d);
    }
}
