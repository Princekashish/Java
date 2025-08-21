package com.Basic.Array;

public class CountFrequency {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 4, 2, 5};
        int key = 2;
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                c++;
            }

        }
        System.out.println(c);
    }
}

