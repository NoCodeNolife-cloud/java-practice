package com.company;

public class Main {

    public static void main(String[] args) {

        int a[][];
        a = new int[3][];
        a[0] = new int[1];
        a[1] = new int[2];
        a[2] = new int[3];

        for (int i = 0; i < a.length; ++i) {

            for (int j = 0; j < a[i].length; ++j) {

                a[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int[] item1 : a) {

            for (int item2 : item1) {

                System.out.print(item2 + " ");
            }
            System.out.println();
        }
    }
}
