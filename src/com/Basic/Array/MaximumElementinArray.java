package com.Basic.Array;

public class MaximumElementinArray {
    public static void main(String[] args) {

        int[] a = {2,5,1,7,3};
        int n =a.length;
        int max=a[0];
        for (int i =1;i<n-1;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println(max);
    }

}
