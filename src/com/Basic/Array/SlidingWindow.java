package com.Basic.Array;
import java.util.*;

public class SlidingWindow {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = arr.length;

        int i = 0;            // left pointer
        int j = 0;            // right pointer
        int sum = 0;          // current window sum

        while (j < n) {
            // expand window by including arr[j]
            sum += arr[j];
            j++;

            // shrink window while sum > target
            while (sum > target && i < j) {
                sum -= arr[i];
                i++;
            }

            // check if sum == target
            if (sum == target) {
                list.add(i + 1);   // 1-based index
                list.add(j + 1);   // 1-based index
                return list;
            }


        }

        list.add(-1);  // no subarray found
        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;
        System.out.println(subarraySum(arr, target)); // [2, 4]
    }
}
