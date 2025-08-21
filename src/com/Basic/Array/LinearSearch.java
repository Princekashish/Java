package com.Basic.Array;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a ={2, 4, 6, 8, 10};
        int key=18;
        boolean value = false;
        for(int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                value=true;
                break;
            }
        }
        System.out.println(value);
    }
}
