package com.NoCodeNoLife;

import java.io.Serializable;

/**
 * Data: Created in 2021/12/3
 * Description:
 */
public class A implements Serializable {

    private int x;
    private String y;

    public A(int x, String y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "A{" +
                "x=" + x +
                ", y='" + y + '\'' +
                '}';
    }
}
