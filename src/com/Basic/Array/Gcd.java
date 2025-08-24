package com.Basic.Array;

public class Gcd {

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        int a = 36, b = 60;
        int result = gcd(a, b);
        System.out.println(result);

    }
}
