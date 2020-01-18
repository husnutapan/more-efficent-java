package com.java.solution.algorithms;

public class SortStackWithTempStack {
    public static void main(String[] args) {
        CustomStack customStack = new CustomStack(5);
        customStack.push(50);
        customStack.push(40);
        customStack.push(30);
        customStack.push(60);
        customStack.push(70);


        sortStack(customStack);
    }


    static CustomStack sortStack(CustomStack customStack) {
        CustomStack tempCustomStack = new CustomStack(customStack.size);

        while (!customStack.isEmpty()) {
            int temp = customStack.pop();
            while (!tempCustomStack.isEmpty() && tempCustomStack.peek() > temp) {
                customStack.push(tempCustomStack.pop());
            }
            tempCustomStack.push(temp);
        }
        return tempCustomStack;

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
        if (!isFull()) {
            top++;
            arr[top] = variable;
        } else {
            throw new RuntimeException("Stack array is full!");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int topTemp = top;
            top--;
            return arr[topTemp];
        } else {
            throw new RuntimeException("Stack array is empty!");
        }
    }

    public int peek() {
        return arr[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (size - 1 == top);
    }
}
