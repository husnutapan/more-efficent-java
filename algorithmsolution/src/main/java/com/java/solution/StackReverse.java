package com.java.solution;

import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class StackReverse {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }
//        reverseStack(stack);
        reverseStackManuel(stack);
    }

    private static void reverseStackManuel(Stack<Integer> stack) {
        Stack<Integer> newStack = new Stack<>();

        while (!stack.isEmpty()) {
            newStack.push(stack.pop());
        }

        newStack.stream().forEach(System.out::println);
    }

    //help from Collection.reverse
    private static void reverseStack(Stack<Integer> stack) {
        stack.sort(Collections.reverseOrder());
        System.out.println(stack);
    }


}
