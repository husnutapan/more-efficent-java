package com.java.solution.algorithms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;


public class BiggerIsGreaterLexicoOrder {

    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {
        List<Integer> stickLengthStore = new ArrayList<>();
        stickLengthStore.add(arr.length);
        while (!isArrayAllElementZero(arr)) {
            int lower = findBigElement(arr);
            if (lower < 0)
                break;
            decreaseCountAllElement(arr, lower);
            stickLengthStore.add(stickLength(arr));
        }
        return stickLengthStore.stream().filter(e -> e > 0).mapToInt(i -> i).toArray();
    }


    static void decreaseCountAllElement(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] - value;
        }
    }

    static int stickLength(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                counter++;
        }
        return counter;
    }

    static int findBigElement(int[] arr) {
        int findLowerNumber = Arrays.stream(arr).filter(e -> e > 0).min().orElse(-1);
        return findLowerNumber;
    }

    static boolean isArrayAllElementZero(int[] arr) {
        AtomicBoolean control = new AtomicBoolean(true);
        Arrays.stream(arr).forEach(e -> {
            if (e != 0)
                control.set(false);
        });
        return control.get();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = cutTheSticks(arr);
        scanner.close();
    }
}
