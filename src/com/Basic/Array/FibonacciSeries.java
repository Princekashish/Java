package com.Basic.Array;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 7;
        int first = 0;
        int second = 1;
        int count = 0;
        System.out.print(first + " ");
        for (int i =1 ;i<n;i++){
            System.out.print(second+" ");
            if (first <= second) {
                count = first + second;
                first = second;
                second=count;
            }
        }

    }
}
