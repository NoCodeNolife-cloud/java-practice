package com.NoCodeNoLife;

import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        TreeMap<Integer, String> tree_map = new TreeMap<>();

        tree_map.put(10, "C");
        tree_map.put(20, "C++");
        tree_map.put(50, "JAVA");
        tree_map.put(40, "PHP");
        tree_map.put(30, "SFDC");

        System.out.println("ceilingEntry 30: " + tree_map.ceilingEntry(30));
        System.out.println("ceilingSet 30: " + tree_map.ceilingKey(30));
        System.out.println("higherEntry 30: " + tree_map.higherEntry(30));
        System.out.println("higherKey 30: " + tree_map.higherKey(30));
    }
}
