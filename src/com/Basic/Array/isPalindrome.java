package com.Basic.Array;

public class isPalindrome {
    public static void main(String[] args) {
        String str1 = "racecar";
        char[] a = str1.toCharArray();
        boolean palindrome=true;

        int left = 0;
        int right = a.length - 1;
        while (right >= left) {
            if (a[right] != a[left]) {
                palindrome=false;
                break;
            }
            right--;
            left++;
        }
        if (palindrome){
            System.out.println("IS Palindrome");
        }else {
            System.out.println("Not pali");
        }
    }
}
