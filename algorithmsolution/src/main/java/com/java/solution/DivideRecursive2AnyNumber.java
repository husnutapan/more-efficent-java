package com.java.solution;

public class DivideRecursive2AnyNumber {

    static int calculate(int value) {
        if (value < 1)
            return 0;
        else if (value == 1)
            return 1;
        else {
            int divided = value / 2;
            System.out.println(divided);
            calculate(divided);
            return divided;
        }
    }

    public static void main(String[] args) {
        calculate(100);
    }

}


