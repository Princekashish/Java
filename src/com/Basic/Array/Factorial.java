package com.Basic.Array;

public class Factorial {
    public static void main(String[] args) {
        int n=5;
        int ans=1;
        while (n>0){
            ans*=n;
            n--;
        }
        System.out.println(ans);
    }
}
