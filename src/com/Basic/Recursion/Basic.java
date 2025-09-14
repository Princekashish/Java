package com.Basic.Recursion;

public class Basic {
    public static void fun2(int n) {
        System.out.println(n);
    }

    public static void fun(int n) {
        if (n <= 0) return;
        System.out.println(n);
        fun2(n);
    }

    public static void funre(int x) {

        if (x == 0) return;
        funre(x - 1);
        System.out.println(x);
    }

    public static void main(String[] args) {
//      fun( 10);
        funre(10);
    }
}
