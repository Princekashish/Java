package com.Basic.Array;

public class ReverseanArray {
    public static void main(String[] args) {
        int[] a={5,4,3,2,1};
        int left =0 ;
        int right =a.length-1;
        while (right>left){
            int temp = a[right];
            a[right]=a[left];
            a[left]=temp;
            right--;
            left++;
        }
        for (int val:a){
            System.out.print(val);
        }
    }
}
