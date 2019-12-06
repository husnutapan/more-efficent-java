package com.java.efficent;

import java.util.concurrent.*;

public class FutureTaskCalculateFactorialWithExecutorService {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //work with 10 thread
        ExecutorService service = Executors.newScheduledThreadPool(10);

        FutureTask[] futureTasks = new FutureTask[10];
        for (int i = 2; i < 12; i++) {
            Callable callable = new TaskCallable(i);
            futureTasks[i - 2] = new FutureTask(callable);
            service.submit(futureTasks[i - 2]);
        }

        for (int i = 2; i < 12; i++) {
            System.out.printf("%d of factorial ise %d", i, futureTasks[i - 2].get());
            System.out.println();
        }
    }

}

class TaskCallableExecutor implements Callable {

    private int number;

    public TaskCallableExecutor(int variable) {
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
