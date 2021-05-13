package com.code;

import java.util.Vector;

public class Prime {

    private boolean Num[];

    public Vector<Integer> getPrime(int _left, int _right) {

        if(_left>=_right){

            return null;
        }

        Vector<Integer> vec = new Vector<>();
        Num = new boolean[_right + 1];

        for (int i = 2; i <= _right; ++i) {

            if (!Num[i]) {

                if (i >= _left) {

                    vec.add(i);
                }

                for (int j = i * 2; j <= _right; j += i) {

                    Num[j] = true;
                }
            }
        }

        return vec;
    }
}
