package com.java.solution.algorithms;

public class ArrayMissingNumbers {


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 7, 8, 9, 10, 1, 2, 3, 3, 4};


        boolean[] temps = new boolean[arr.length];

        for (int var : arr) {
            temps[var] = true;
        }

        for (int i = 0; i < temps.length; i++) {
            if (!temps[i])
                System.out.println(i);
        }

    }
}
