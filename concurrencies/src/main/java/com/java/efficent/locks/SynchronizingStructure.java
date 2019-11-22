package com.java.efficent.locks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class SynchronizingStructure {
    int counter = 0;


    synchronized void increaseOne() {
        counter = counter + 1;
    }


    void startService() throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(5);

        IntStream.range(0, 10000).forEach(consumer -> {
            service.submit(this::increaseOne);
        });
        service.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println(counter);
    }

    public static void main(String[] args) throws InterruptedException {
        SynchronizingStructure withoutSynchronizingStructure = new SynchronizingStructure();
        withoutSynchronizingStructure.startService();


    }

}
