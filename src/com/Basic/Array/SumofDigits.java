package com.Basic.Array;

public class SumofDigits {
    public static void main(String[] args) {
        int n = 1234 , c=0;
       while (n>0){
           c+=n%10;
           n=n/10;
       }
        System.out.println(c);

    }
}
