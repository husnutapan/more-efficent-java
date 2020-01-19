package com.java.solution;

import java.util.HashSet;

public class StringAllCharsUnique {
    static boolean isUniqueWithBooleanArray(String value) {
        boolean[] booleans = new boolean[127];
        for (int i = 0; i < value.length(); i++) {
            int v1 = value.charAt(i);
            if (booleans[v1])
                return false;
            booleans[v1] = true;
        }
        return true;
    }

    static boolean isUniqueWithHashSet(String value) {
        HashSet<Character> characters = new HashSet<>();
        for (Character character : value.toCharArray()) {
            if (characters.contains(character))
                return false;
            characters.add(character);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isUniqueWithHashSet("husn"));
        System.out.println(isUniqueWithBooleanArray("test"));

    }

}
