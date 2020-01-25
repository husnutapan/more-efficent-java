package com.asked.stackoverflow;

//https://stackoverflow.com/questions/7569335/reverse-a-string-in-java
public class StringReverse {
    public static void main(String[] args) {
        String value = "test husnu string";
        //usage with string builder or string buffer...
        System.out.println(new StringBuffer(value).reverse().toString());
        System.out.println(new StringBuilder(value).reverse().toString());
        //recursive reverse string...
        System.out.println(reverseStringRecursively(value));
    }

    static String reverseStringRecursively(String value) {
        if (value.length() == 0) return "";
        return value.charAt(value.length() - 1) + reverseStringRecursively(value.substring(0, value.length() - 1));
    }
}
