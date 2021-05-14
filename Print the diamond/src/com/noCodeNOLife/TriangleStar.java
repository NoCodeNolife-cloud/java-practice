package com.noCodeNOLife;

public class TriangleStar {

    public TriangleStar(int length) {

        for (int space = length-1, dot = 1; space >= 0; --space, dot += 2) {

            for (int i = 0; i <= space; ++i) {

                System.out.print(" ");
            }

            for (int i = 0; i < dot ; ++i) {

                System.out.print("*");
            }

            System.out.println();
        }

        for (int space = 1, dot = length*2-3; dot >= 0; ++space, dot -= 2) {

            for (int i = 0; i <= space; ++i) {

                System.out.print(" ");
            }

            for (int i = 0; i < dot; ++i) {

                System.out.print("*");
            }

            System.out.println();
        }
    }
}
