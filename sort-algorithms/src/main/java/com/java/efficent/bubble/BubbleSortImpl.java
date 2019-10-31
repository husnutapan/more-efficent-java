package com.java.efficent.bubble;

import java.util.Arrays;

import static helper.SortHelper.swap;


//Time complexity is O(n^2)
public class BubbleSortImpl {

    static int[] sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] vars = new int[]{5, 3, 6, 7, 1, 4};
        Arrays.stream(sort(vars)).forEach(System.out::println);
    }
}
