package com.java.efficent;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinPoolWithRecursiveTask extends RecursiveTask<Integer> {

    private static final int MAX_THREAD = 5;


    int from, to;

    ForkJoinPoolWithRecursiveTask(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    protected Integer compute() {

        if (to - from < 10_000) {
            int sum = 0;

            for (int i = from; i <= to; i++) {
                sum += i;
            }
            return sum;
        } else {
            int middle = (from + to) / 2;

            ForkJoinPoolWithRecursiveTask firstSide = new ForkJoinPoolWithRecursiveTask(from, middle);
            firstSide.fork();

            ForkJoinPoolWithRecursiveTask secondSide = new ForkJoinPoolWithRecursiveTask(middle + 1, to);
            int resultSecond = secondSide.compute();

            return firstSide.join() + resultSecond;
        }
    }

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool(MAX_THREAD);

        int sum = forkJoinPool.invoke(new ForkJoinPoolWithRecursiveTask(0, 1_000_000));
        System.out.println(sum);
    }
}
