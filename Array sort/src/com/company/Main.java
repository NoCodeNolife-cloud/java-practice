package com.company;

public class Main {

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 1, 3, 5, 7};

        sort(arr, 0, arr.length - 1);

        for (int item : arr) {

            System.out.printf("%5d", item);
        }
    }

    public static void sort(int[] arr, int left, int right) {

        int tleft = left;
        int tright = right;
        int middle = arr[(left + right) / 2];

        while (tleft <= tright) {

            while (arr[tleft] < middle) {

                ++tleft;
            }

            while (middle < arr[tright]) {

                --tright;
            }

            if (tleft <= tright) {

                int tmp = arr[tleft];
                arr[tleft] = arr[tright];
                arr[tright] = tmp;

                ++tleft;
                --tright;
            }
        }

        if (tleft == tright) {

            ++tleft;
        }

        if (tleft < right) {

            sort(arr, tright + 1, right);
        }

        if (left < tright) {

            sort(arr, left, tleft - 1);
        }
    }
}
