package com.asked.stackoverflow;

public class IntegerPalidrome {

    public boolean isPalindrome(int x) {
        String convert = String.valueOf(x);

        boolean isPalidrome = true;
        for (int i = 0; i < convert.length() / 2; i++) {
            if (convert.charAt(i) != convert.charAt(convert.length() - 1 - i)) {
                isPalidrome = false;
                break;
            }
        }
        return isPalidrome;
    }


    public static void main(String[] args) {
        System.out.println(new IntegerPalidrome().isPalindrome(1212));
    }
}
