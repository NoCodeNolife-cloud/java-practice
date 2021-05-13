package com.code;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Integer vec[];
        vec = new Integer[100];
        Random random = new Random();

        for (Integer item : vec) {

            item = random.nextInt(100);
        }

        // all item is null
        // that shows for each can't initial the array
        for (Integer item : vec) {

            System.out.println(item);
        }
    }
}
