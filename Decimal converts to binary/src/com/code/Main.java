package com.code;

import javax.management.timer.Timer;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("convert decimal value to binary value:");

        int decimal = 0;
        while (decimal <= 10) {
            System.out.println(decimal + " is " + Integer.toString(decimal, 2));
            ++decimal;
        }

        Random random = new Random();
        decimal = random.nextInt(10);
        System.out.println(decimal + " is " + Integer.toString(decimal, 2));
    }
}
