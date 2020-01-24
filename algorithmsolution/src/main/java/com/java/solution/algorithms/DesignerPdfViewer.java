package com.java.solution.algorithms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DesignerPdfViewer {

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
        int findBigNumber = Integer.MIN_VALUE;
        String str = word.toLowerCase();
        char[] ch = str.toCharArray();
        for (char c : ch) {
            int temp_integer = 96; //for lower case
            if ((int) c <= 122 & (int) c >= 97) {
                int index = (int) c - temp_integer;
                if (h[index] > findBigNumber) {
                    findBigNumber = h[index];
                }
            }
        }
        return findBigNumber * word.length();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);

        scanner.close();
    }
}
