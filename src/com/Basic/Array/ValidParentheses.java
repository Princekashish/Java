package com.Basic.Array;

public class ValidParentheses {
    public static void main(String[] args) {
        String name = "{[()]}";
        char[] a=name.toCharArray();
        int right = a.length-1;
        int left=0;
        boolean valid =true;
        while (right>=left){
            if (a[left] != a[right]){
               valid =false;
            }
            left++;
            right--;
        }
        System.out.println(valid);
    }
}
