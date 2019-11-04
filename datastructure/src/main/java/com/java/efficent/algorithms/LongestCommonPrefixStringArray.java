package com.java.efficent.algorithms;

public class LongestCommonPrefixStringArray {
    public static void main(String[] args) {
        String[] arr = new String[]{"husnutest", "husnu1234", "husnu1", "husnu"};

        String prefix = longestCommonPrefix(arr);
        System.out.println(prefix);

    }

    private static String longestCommonPrefix(String[] arr) {
        String min = getMinString(arr);
        int minLength = min.length();

        for (int i = 0; i < arr.length; i++) {
            int t;
            for (t = 0; t < minLength; t++) {
                if (min.charAt(t) != arr[i].charAt(t)) break;
            }
            if (t < minLength)
                minLength = t;
        }
        return min.substring(0, minLength);
    }


    private static String getMinString(String[] arr) {
        String min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() < min.length())
                min = arr[i];
        }
        return min;
    }


}
