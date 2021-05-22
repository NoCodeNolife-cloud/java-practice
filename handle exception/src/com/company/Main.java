package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("x:");
        double x = input.nextDouble();
        System.out.print("y:");
        double y = input.nextDouble();

        try {

            System.out.println(x + "/" + y + " = " + Except.divide(x, y));
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }
    }
}
