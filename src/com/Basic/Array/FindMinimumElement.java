package com.Basic.Array;

public class FindMinimumElement {
    public static void main(String[] args) {
        int[] a={1,2,2,3,4,2,5};
        int sm=a[0];
        for (int i = 1; i < a.length ; i++) {
            if(sm>a[i]){
                sm=a[i];
            }

        }
        System.out.println(sm);
    }
}
