package com.Basic.Array;

import java.util.*;

public class Inital {

    public static void fillArray(int[] a) {
        Scanner sc = new Scanner(System.in);
        int x = a.length;
        for (int i = 0; i < x; i++) {
            System.out.print("Enter value index " + i + ":");
            a[i] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        int[] a = new int[5];
        fillArray(a);
        for (int value : a) {
            System.out.println("value "+value);
        }
    }
}
