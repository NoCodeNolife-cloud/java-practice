package com.NoCodeNoLife;

import java.util.Collections;
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

        for (String set : tree_map.values()) {
            System.out.println(set);
        }
    }
}
