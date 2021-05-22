package com.nocodenolife;

import java.util.Random;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        // declare and initialize
        Vector<Integer> vector = new Vector<>();
        vector.setSize(15);
        Random random = new Random();
        for (int i = 0; i < vector.size(); ++i) {

            vector.set(i, random.nextInt(100));
        }

        // printf
        for (Integer integer : vector) {

            System.out.printf("%5d", integer);
        }
        System.out.println();

        // sort
        for (int i = 0; i < vector.size(); ++i) {

            for (int j = 0; j < vector.size() - 1 - i; ++j) {

                if (vector.get(j+1) > vector.get(j)) {

                    int temp = vector.get(j);
                    vector.set(j, vector.get(j+1));
                    vector.set(j+1, temp);
                }
            }
        }

        // printf
        for (Integer integer : vector) {

            System.out.printf("%5d", integer);
        }
        System.out.println();
    }
}
