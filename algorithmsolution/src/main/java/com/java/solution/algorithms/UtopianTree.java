package com.java.solution.algorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UtopianTree {

    static int utopianTree(int n) {
        int height = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                height = height * 2;
            } else {
                height = height + 1;
            }
        }
        return height;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int result = utopianTree(n);

        }
        scanner.close();
    }

}
