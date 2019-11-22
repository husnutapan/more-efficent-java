package com.java.solution;

import java.util.Stack;

public class HanoiTower {
    static Stack<Character> stackValueA = new Stack<>();
    static Stack<Character> stackValueB = new Stack<>();
    static Stack<Character> stackValueC = new Stack<>();

    static void hanoiTower(int count, char aStack, char bStack, char cStack) {
        if (count == 1) {
            stackValueC.push(stackValueA.pop());
            return;
        }
        hanoiTower(count - 1, aStack, cStack, bStack);
        stackValueC.push(stackValueA.pop());
        hanoiTower(count - 1, cStack, bStack, aStack);
    }


    public static void main(String[] args) {
        stackValueA.push('B');
        stackValueA.push('C');
        stackValueA.push('A');

        hanoiTower(stackValueA.size(), 'A', 'C', 'B');
        System.out.println("adsldnm");
    }

}
