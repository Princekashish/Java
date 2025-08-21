package com.Basic.Array;

public class Smax {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10};
        int max=a[0];
        int secMax=0;
        int n =a.length;
        for(int i =1 ;i<n;i++){
            if(a[i]>max){
                secMax=max;
                max=a[i];
            }else if(a[i]>secMax && max > secMax){
                secMax=a[i];
            }
        }
        System.out.println(secMax);
    }
}
