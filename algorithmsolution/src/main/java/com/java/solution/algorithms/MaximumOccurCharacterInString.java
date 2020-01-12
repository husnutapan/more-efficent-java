package com.java.solution.algorithms;

public class MaximumOccurCharacterInString {

    public static char findMaxOccurChar(String value) {
        //for use ascii code increase count character
        int[] charsCount = new int[256];
        int max = -1;
        char maxOccurChar = value.toCharArray()[0];
        for (int i = 0; i < value.length(); i++) {
            charsCount[value.charAt(i)]++;
        }
        //find which character include in text...
        for (int i = 0; i < value.length(); i++) {
            if (max < charsCount[value.charAt(i)]) {
                max = charsCount[value.charAt(i)];
                maxOccurChar = value.charAt(i);
            }
        }
        return maxOccurChar;
    }

    public static void main(String[] args) {
        System.out.println(findMaxOccurChar("test sample textttt."));
    }
}
