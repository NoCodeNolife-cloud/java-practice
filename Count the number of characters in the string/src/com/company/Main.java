package com.company;

import java.util.Map;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        String str = "abcdeafg";
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); ++i) {

            if (map.containsKey(str.charAt(i))) {

                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else {

                map.put(str.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
