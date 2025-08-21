package com.Basic.Array;

public class FindIndex {
    public static void main(String[] args) {
        int[] a={2,4,6,8,10};
        int key=8;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                System.out.println(i);
            }
        }
    }
}
