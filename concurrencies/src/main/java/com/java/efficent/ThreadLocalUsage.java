package com.java.efficent;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class ThreadLocalUsage {
    public static void main(String[] args) {
        new Thread(() -> IntStream.range(1, 100).forEach(consumer -> {
            System.out.println(Thread.currentThread().getName() + " : " + new MyThread().get());
        })).start();

        new Thread(() -> IntStream.range(1, 100).forEach(consumer -> {
            System.out.println(Thread.currentThread().getName() + " : " + new MyThread().get());
        })).start();

        new Thread(() -> IntStream.range(1, 100).forEach(consumer -> {
            System.out.println(Thread.currentThread().getName() + " : " + new MyThread().get());
        })).start();
    }
}


class MyThread {
    static final AtomicInteger nextId = new AtomicInteger(10);
    static final ThreadLocal<Integer> threadId = ThreadLocal.withInitial(nextId::getAndIncrement);

    public int get() {
        return threadId.get();
    }

}
