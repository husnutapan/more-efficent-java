package com.java.efficent.bubble;

import java.util.Arrays;

import static helper.SortHelper.swap;


//Time complexity is O(n^2)
public class BubbleSortWithSwappedImpl {

    static int[] sort(int[] arr) {
        boolean isSwapped = false;
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            isSwapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    isSwapped = true;
                }
            }
            if (!isSwapped) break;
        }
        return arr;
    }



    public static void main(String[] args) {
        int[] vars = new int[]{5, 3, 6, 7, 1, 4};
        Arrays.stream(sort(vars)).forEach(System.out::println);
    }
}
