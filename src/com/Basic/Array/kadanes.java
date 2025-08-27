package com.Basic.Array;

public class kadanes {
    public static void main(String[] args) {
        int[] a= {1, 2, 3, 7, 5};
        int n =a.length;
        int currIndex = 0 ,maxsum=Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            currIndex += a[i];
            maxsum=Math.max(currIndex,maxsum);
            if(currIndex < 0){
                currIndex=0;
            }
        }
        System.out.println(maxsum);
    }
}
