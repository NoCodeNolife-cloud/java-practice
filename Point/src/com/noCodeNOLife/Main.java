package com.noCodeNOLife;

public class Main {

    public static void main(String[] args) {

        Point point1 = new Point(4, 5);
        Point point2 = new Point(6, 7);
        point1.add(point2);
        point1.show();
        point2.subtract(point1);
        point2.show();
    }
}
