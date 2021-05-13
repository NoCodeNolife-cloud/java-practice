package com.code;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        Prime prime = new Prime();
        Vector<Integer> vec = prime.getPrime(100, 200);

        for (Integer item : vec) {

            System.out.println(item);
        }
    }
}
