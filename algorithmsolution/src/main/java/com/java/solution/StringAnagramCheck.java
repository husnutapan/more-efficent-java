package com.java.solution;

import java.util.Arrays;

public class StringAnagramCheck {

    static boolean checkAnagramWithArray(String one, String two) {
        char[] charsOne = one.toCharArray();
        char[] charsTwo = two.toCharArray();

        Arrays.sort(charsOne);
        Arrays.sort(charsTwo);

        return Arrays.equals(charsOne, charsTwo);
    }


    static boolean checkAnagram(String one, String two) {
        char[] chars = one.toCharArray();
        StringBuilder builder = new StringBuilder(two);

        for (char c : chars) {
            int index = builder.indexOf(String.valueOf(c));
            if (index != -1)
                builder.deleteCharAt(index);
            else
                return false;
        }
        return builder.length() == 0;
    }

    public static void main(String[] args) {
        System.out.println(checkAnagram("husnu", "usnhu"));
        System.out.println(checkAnagramWithArray("husnu", "usnhu"));
    }
}
