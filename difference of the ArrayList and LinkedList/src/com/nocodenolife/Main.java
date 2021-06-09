package com.nocodenolife;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        // LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();

        // initialise
        for (int i = 0; i < 10; ++i) {

            linkedList.add(random.nextInt(100));
        }

        // print
        System.out.println(linkedList);

        // LinkedList method
        linkedList.add(5, 5);
        System.out.println("add->"+linkedList);
        linkedList.removeFirst();
        System.out.println("remove first->"+linkedList);
        linkedList.removeLast();
        System.out.println("remove last"+linkedList);

        // ArrayList
        ArrayList<Integer> arrayList=new ArrayList<>();

        // initialise
        for(int i=0;i<10;++i){

            arrayList.add(random.nextInt(100));
        }

        // print
        System.out.println(arrayList);

        // ArrayList method
        arrayList.add(5,10);
        System.out.println("add->"+arrayList);
    }
}
