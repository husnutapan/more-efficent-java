package com.java.efficent.stack;

public class StackUseWithArray {
    public static void main(String[] args) {
        CustomStack customStack = new CustomStack(10);
        customStack.push(1);
        customStack.push(2);
        customStack.push(3);
        customStack.push(4);
        customStack.push(5);
        customStack.push(6);
        customStack.pop();
        customStack.pop();
        customStack.pop();
        
        System.out.println(customStack.top);
    }
}

class CustomStack {
    int size;
    int arr[];
    int top;

    CustomStack(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public void push(int variable) {
        if (!stackIsFull()) {
            top++;
            arr[top] = variable;
        } else {
            throw new RuntimeException("Stack array is full!");
        }
    }

    public int pop() {
        if (!stackIsEmpty()) {
            int topTemp = top;
            top--;
            return arr[topTemp];
        } else {
            throw new RuntimeException("Stack array is empty!");
        }
    }

    private boolean stackIsEmpty() {
        return (top == -1);
    }

    private boolean stackIsFull() {
        return (size - 1 == top);
    }
}
