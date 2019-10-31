package com.java.efficent.bubble;

import java.util.Arrays;

import static helper.SortHelper.swap;

public class SelectionSortImpl {
    static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            swap(arr, i, minIndex);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] vars = new int[]{5, 3, 6, 7, 1, 4};
        Arrays.stream(sort(vars)).forEach(System.out::println);
    }
}
