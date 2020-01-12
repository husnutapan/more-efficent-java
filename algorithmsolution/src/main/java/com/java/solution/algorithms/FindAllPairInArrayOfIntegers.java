package com.java.solution.algorithms;

//Brute force find pairs
public class FindAllPairInArrayOfIntegers {
    static void findPairs(int[] arr, int targetSum) {
        for (int i = 0; i < arr.length; i++) {
            int tempFirst = arr[i];
            for (int j = i; j < arr.length; j++) {
                int tempSecond = arr[j];
                if ((tempFirst + tempSecond) == targetSum) {
                    String consoleText = "{" + tempFirst + "," + tempSecond + "}";
                    System.out.println(consoleText);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        findPairs(numbers, 11);
    }

}
