package com.company;

public class Except {

    public static double divide(double x, double y) throws Exception {

        if (y == 0) {

            throw new Exception("can't divide zero");
        } else {

            return x / y;
        }
    }
}
