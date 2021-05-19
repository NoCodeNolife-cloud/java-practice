package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.print("input the length of the array:");
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();

        int[][] vec = new int[length][length];
        vec[0][0] = 1;
        vec[0][1] = 2;
        vec[1][1] = 3;
        vec[1][0] = 4;
        vec[2][0] = 5;

        int i = 6;
        int j = 2;
        int x = 2;
        int y = 0;
        boolean bool = false;
        while (true) {

            if (!bool) {
                for (int k = 0; k < j; ++k) {

                    vec[x][++y] = i;
                    ++i;
                }
                for (int k = 0; k < j; ++k) {

                    vec[--x][y] = i;
                    ++i;
                }
                if (i != length * length + 1) {

                    vec[x][++y] = i;
                    ++i;
                } else {

                    break;
                }
                bool = true;
            } else {

                for (int k = 0; k < j; ++k) {

                    vec[++x][y] = i;
                    ++i;
                }
                for (int k = 0; k < j; ++k) {

                    vec[x][--y] = i;
                    ++i;
                }
                if (i != length * length + 1) {

                    vec[++x][y] = i;
                    ++i;
                } else {

                    break;
                }

                bool = false;
            }
            ++j;
        }

        for (int[] ints : vec) {

            for (int anInt : ints) {

                System.out.printf("%5d", anInt);
            }
            System.out.println();
        }
    }
}
