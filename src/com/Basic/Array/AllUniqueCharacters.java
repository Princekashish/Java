package com.Basic.Array;

public class AllUniqueCharacters {
    public static void main(String[] args) {
        String str = "abcdef";
        char[] a = str.toCharArray();
        int n = a.length;
        boolean isUnique = false;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                isUnique =true;
            }else {
                isUnique=false;
                break;
            }
        }
        System.out.println(isUnique);
    }
}
