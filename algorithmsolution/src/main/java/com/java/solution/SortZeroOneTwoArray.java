package com.java.solution;

public class SortZeroOneTwoArray {

    public static void main(String[] args) {

        int[] a = {1, 2, 2, 0, 0, 1, 2, 2, 1};
        sort(a);
        for (int val : a) {
            System.out.print(val + " ");
        }

    }

    public static void sort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int middle = 0;
        int temp = 0;

        while (middle <= right) {
            switch (arr[middle]) {
                case 0:
                    temp = arr[left];
                    arr[left] = arr[middle];
                    arr[middle] = temp;
                    left++;
                    middle++;
                    break;
                case 1:
                    middle++;
                    break;
                case 2:
                    temp = arr[middle];
                    arr[middle] = arr[right];
                    arr[right] = temp;
                    right--;
                    break;

            }
        }

    }

}