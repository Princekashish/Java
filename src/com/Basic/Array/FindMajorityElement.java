package com.Basic.Array;

public class FindMajorityElement {
    public static void main(String[] args) {

        int[] a = {2, 2, 1, 2, 2, 2, 2};
        int n = a.length;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                System.out.println("Majority Element " + a[i]);
                return;
            }

        }
    }
}
