package com.Basic.Array;

public class Palindrome {
    public static void main(String[] args) {
        String name ="hello";
        char[] a = name.toCharArray();
        int n = a.length;
        int left = 0;
        int right = n-1;
        while (right>left){
            char temp = a[right];
            a[right]=a[left];
            a[left] = temp;
            right--;
            left++;

        }
        String reverse = new String(a);
        if (reverse.equals(name)) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
