package com.java.solution.search;

public class LinearSearchAlgorithm {
    static int linearSearch(int arr[], int variable) throws Exception {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == variable) return i;
        }
        throw new Exception("Variable not found");
    }


    public static void main(String[] args) throws Exception {
        int index = linearSearch(new int[]{1, 5, 3, 2, 9}, 2);
        System.out.println("Your search number include in array, index is:" + index);
    }


}
