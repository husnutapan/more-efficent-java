package com.java.solution.search;

public class BinarySearchAlgorithm {
    Integer stepCount = 0;

    public void algorithm(int[] arr, int firstIndex, int lastIndex, int number) {
        int middle = firstIndex + (lastIndex - firstIndex) / 2;

        if (arr[middle] == number) {
            System.out.println("found this number inside of arr:" + number);
            return;
        }

        stepCount = ++stepCount;

        if (arr[middle] < number) {
            algorithm(arr, middle + 1, lastIndex, number);
        } else {
            algorithm(arr, firstIndex, middle - 1, number);
        }
    }


    public static void main(String[] args) {
        BinarySearchAlgorithm binarySearchAlgorithm = new BinarySearchAlgorithm();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        binarySearchAlgorithm.algorithm(arr, 0, arr.length - 1, 6);
        System.out.println(binarySearchAlgorithm.stepCount);
    }
}
