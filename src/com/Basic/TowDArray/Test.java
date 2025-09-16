package com.Basic.TowDArray;

public class Test {
    public static void main(String[] args) {
        int[][] tasks = {
                {2, 5},
                {1, 3},
                {4, 2}
        };
        for (int i = 0; i < tasks.length; i++) {
            for (int j = 0; j < tasks[i].length; j++) {
                System.out.println(tasks[i][j]);
            }
        }
    }
}
