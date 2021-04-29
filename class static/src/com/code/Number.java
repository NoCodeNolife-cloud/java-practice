package com.code;

public class Number {

    static private int count = 0;

    private int value;

    public Number(int _value) {
        ++count;
        value = _value;
    }

    public int getValue(){
        return value;
    }

    public int getCount() {
        return count;
    }
}
