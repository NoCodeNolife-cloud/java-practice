package com.code;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        GuessNum guessNum = new GuessNum();

        int time = 0;
        int value;
        do {

            ++time;
            value = input.nextInt();
        } while (!guessNum.guess(value));

        System.out.println("guess time is " + time);
    }
}
