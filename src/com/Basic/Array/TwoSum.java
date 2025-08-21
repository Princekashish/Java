package com.Basic.Array;

public class TwoSum {
    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};
        int key = 9;
        int n = a.length;
        int left = 0;
        int right = n - 1;
        while (right > left) {
            if ((a[right] + a[left]) == key) {
                System.out.println(left+ ","+ right);
            }
            if (a[right] > key) {
                right--;
            } else {
                left++;
            }
        }

    }
}
