package com.code;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        int value;
        do {
            value = random.nextInt(150);
            System.out.println(value);
        } while (value <= 100);
    }
}
