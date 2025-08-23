package com.Basic.Array;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String name = "listen";
        String check = "silent";
        if (name.length() != check.length()) {
            System.out.println("false");
        }
        char[] str1 = name.toCharArray();
        char[] str2 = check.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        if(Arrays.equals(str1,str2)){
            System.out.println("False");
        }else System.out.println("True");
    }
}
