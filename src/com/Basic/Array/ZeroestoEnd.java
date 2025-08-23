package com.Basic.Array;

public class ZeroestoEnd {
    public static void main(String[] args) {
        int[] a = {0, 1, 0, 3, 12};
        int n = a.length;
        int check = 0; // 1 2 3
        for (int i = 0; i < n; i++) {
            if(a[i] !=0){
                a[check]=a[i];
                check++;
            }
        }
        while (check<n){
            a[check]=0;
            check++;
        }

        for (int val :a){
            System.out.print(val+",");
        }
    }
}
