package com.code;

import java.util.Random;

public class GuessNum {

    private int number;

    public GuessNum() {

        Random random = new Random();
        number = random.nextInt(100);
    }

    public boolean guess(int _number) {

        if (_number > number) {

            System.out.println("too high");
            return false;
        } else if (_number < number) {

            System.out.println("too low");
            return false;
        } else {

            return true;
        }
    }
}
