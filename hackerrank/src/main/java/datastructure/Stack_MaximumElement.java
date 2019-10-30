package datastructure;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class Stack_MaximumElement {
    public static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int processCount = scanner.nextInt();

        while (processCount != 0) {
            int processType = scanner.nextInt();
            if (processType == 1) {
                int processData = scanner.nextInt();
                addDataToStack(processData);
            }
            if (processType == 2) {
                removeElementFromTop();
            }
            if (processType == 3) {
                printDataTheMostBigger();
            }
            processCount--;
        }
    }

    public static void addDataToStack(int data) {
        stack.push(data);
    }


    public static void removeElementFromTop() {
        stack.pop();
    }

    private static void printDataTheMostBigger() {
        int max = Integer.MIN_VALUE;
        Iterator<Integer> iterator = stack.iterator();
        while (iterator.hasNext()){
            Integer value = iterator.next();
            if(max<value){
                max = value;
            }
        }
        System.out.println(max);
    }
}
