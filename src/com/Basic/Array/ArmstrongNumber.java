package com.Basic.Array;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n =153;
        double c =0;
        while (n>0){
           c+= Math.pow((n%10),3);
            n=n/10;

        }
        if (n == c ){
            System.out.println("True");
        }else {
            System.out.println("False");
        }

    }
}
