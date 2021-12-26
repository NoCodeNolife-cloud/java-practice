package com;

import java.util.Collections;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        LinkedList<LinkedList<Integer>> track = new LinkedList<>();
        Integer[] nodes1 = {0, 1, 12, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};
        Integer[] nodes2 = {Integer.MAX_VALUE, 0, 9, 3, Integer.MAX_VALUE, Integer.MAX_VALUE};
        Integer[] nodes3 = {Integer.MAX_VALUE, Integer.MAX_VALUE, 0, Integer.MAX_VALUE, 5, Integer.MAX_VALUE};
        Integer[] nodes4 = {Integer.MAX_VALUE, Integer.MAX_VALUE, 4, 0, 13, 15};
        Integer[] nodes5 = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 0, 4};
        Integer[] nodes6 = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 0};
        LinkedList<Integer> node1 = new LinkedList<>();
        LinkedList<Integer> node2 = new LinkedList<>();
        LinkedList<Integer> node3 = new LinkedList<>();
        LinkedList<Integer> node4 = new LinkedList<>();
        LinkedList<Integer> node5 = new LinkedList<>();
        LinkedList<Integer> node6 = new LinkedList<>();
        Collections.addAll(node1, nodes1);
        Collections.addAll(node2, nodes2);
        Collections.addAll(node3, nodes3);
        Collections.addAll(node4, nodes4);
        Collections.addAll(node5, nodes5);
        Collections.addAll(node6, nodes6);
        track.add(node1);
        track.add(node2);
        track.add(node3);
        track.add(node4);
        track.add(node5);
        track.add(node6);

        LinkedList<Integer> res = findRout(track, 0);
        System.out.println(res);
    }

    public static LinkedList<Integer> findRout(LinkedList<LinkedList<Integer>> track, int start) {
        LinkedList<Integer> tmp = track.get(start);
        LinkedList<Integer> route = new LinkedList<>();
        route.add(start);
        while (route.size() != track.get(0).size()) {
            // find min index
            int min_index = -1;
            int min_value = Integer.MAX_VALUE;
            for (int i = 0; i < tmp.size(); i++) {
                if (!route.contains(i)) {
                    if (tmp.get(i) < min_value) {
                        min_index = i;
                        min_value = tmp.get(i);
                    }
                }
            }
            route.add(min_index);
            int tmp_value = tmp.get(min_index);
            for (int i = 0; i < tmp.size(); i++) {
                if(track.get(min_index).get(i)==Integer.MAX_VALUE){
                    continue;
                }
                if (track.get(min_index).get(i) + tmp_value < tmp.get(i)) {
                    tmp.set(i, track.get(min_index).get(i) + tmp_value);
                }
            }
        }
        return tmp;
    }
}
