package com.java.solution;

public class StringIsRotated {

    static boolean isRotated(String t1, String t2) {
        int t1Length = t1.length();
        if (t1Length == t2.length() && t1Length > 0) {
            String combine = t1 + t1;
            if (combine.indexOf(t2) > 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isRotated("apple", "leapp"));
    }
}
