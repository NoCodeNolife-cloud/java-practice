package com.noCodeNOLife;

public class Point {

    private double x;
    private double y;

    public Point(int x, int y) {

        this.x = x;
        this.y = y;
    }

    public void add(Point point) {

        this.x += point.x;
        this.y += point.y;
    }

    public void subtract(Point point) {

        this.x -= point.x;
        this.y -= point.y;
    }

    public void show() {

        System.out.println("x=" + x + ", y=" + y);
    }
}
