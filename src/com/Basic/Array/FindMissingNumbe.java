package com.Basic.Array;

public class FindMissingNumbe {
    public static void main(String[] args) {
        int[] a = {1,2,3,5};
        int n = a.length;
        int check =1;
        for (int i = 0; i < n; i++) {
            if(a[i] != check){
                System.out.println(check);
                break;
            }
            check++;
        }

    }

}
