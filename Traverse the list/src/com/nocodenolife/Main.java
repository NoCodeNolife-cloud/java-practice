package com.nocodenolife;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {

            list.add(i);
        }

        Iterator<Integer> pos = list.iterator();
        // get method
        System.out.println("get method");
        System.out.println(list.get(0));
        //  iterator method
        System.out.println("Use iterator method");
        while (pos.hasNext()) {

            Integer integer = pos.next();
            if (integer % 2 == 0) {

                pos.remove();
            }
        }


        System.out.println(list);

        Vector<Integer> vector = new Vector<>();
        vector.setSize(10);
        Random random = new Random();
        for (int i = 0; i < vector.size(); ++i) {

            vector.set(i, random.nextInt(100));
            if(vector.get(i)%2==0){
                vector.remove(vector.get(i));
            }
        }
        System.out.println(vector);
    }
}
