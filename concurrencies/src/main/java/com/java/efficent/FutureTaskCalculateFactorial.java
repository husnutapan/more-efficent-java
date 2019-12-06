package com.java.efficent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class FutureTaskCalculateFactorial {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask[] futureTasks = new FutureTask[10];
        for (int i = 2; i < 12; i++) {
            Callable callable = new TaskCallable(i);
            futureTasks[i - 2] = new FutureTask(callable);
            futureTasks[i - 2].run();
        }

        for (int i = 2; i < 12; i++) {
            System.out.printf("%d of factorial ise %d", i, futureTasks[i - 2].get());
            System.out.println();
        }
    }

}

class TaskCallable implements Callable {

    private int number;

    public TaskCallable(int variable) {
        this.number = variable;
    }

    @Override
    public Object call() {
        int result = 1;

        for (int i = 2; i <= number; i++) {
            result = result * i;
        }
        return result;
    }
}
