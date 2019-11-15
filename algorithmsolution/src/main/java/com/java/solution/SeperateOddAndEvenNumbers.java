package com.java.solution;

import java.util.Arrays;

public class SeperateOddAndEvenNumbers {

    public static void main(String[] args) {
        int[] vars = new int[]{4, 5, 7, 3, 8, 9, 10};

        seperate(vars);

        Arrays.stream(vars).forEach(System.out::println);
    }

    private static void seperate(int[] vars) {
        int leftIndex = 0;
        int rightIndex = vars.length - 1;

        for (int i = 0; i < vars.length; i++) {
            while (vars[leftIndex] % 2 == 0) leftIndex++;
            while (vars[rightIndex] % 2 == 1) rightIndex--;

            if (leftIndex < rightIndex) {
                int temp = vars[leftIndex];
                vars[leftIndex] = vars[rightIndex];
                vars[rightIndex] = temp;
            }
        }
    }
}
