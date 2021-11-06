package com.NoCodeNoLife;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        TreeMap<Integer, String> tree_map = new TreeMap<>();

        tree_map.put(10, "C");
        tree_map.put(20, "C++");
        tree_map.put(50, "JAVA");
        tree_map.put(40, "PHP");
        tree_map.put(30, "SFDC");

        for (Integer integer : tree_map.keySet()) {
            System.out.println(integer);
        }
        System.out.println();
    }
}
