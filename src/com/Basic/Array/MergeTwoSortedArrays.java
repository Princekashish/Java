package com.Basic.Array;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a = {1, 3, 5};
        int[] b = {2, 4, 6};
        int c = a.length + b.length;
        int[] result = new int[c];
        int i = 0, j = 0, k = 0;
        while (a.length > i && b.length > j){
            if (a[i]<b[j]){
                result[k++]=a[i++];
            }else{
                result[k++]=b[i++];
            }
        }
    }
}
