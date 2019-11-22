package com.java.efficent.locks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.stream.IntStream;

public class LockTypes extends Helper {
    ExecutorService service = Executors.newFixedThreadPool(5);
    ReentrantLock reentrantLock = new ReentrantLock();
    ReadWriteLock readWriteLock = new ReentrantReadWriteLock();


    int counter = 0;

    void reentrant() {
        reentrantLock.lock();
        try {
            counter++;
        } finally {
            reentrantLock.unlock();
        }
    }

    void testReentrant() throws InterruptedException {
        //lock test
        this.testReentrant(reentrantLock);
        //for reentrant
        IntStream.range(0, 10000).forEach(consumer -> {
            service.submit(this::reentrant);
        });
        service.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println(counter);
    }


    void testReadWrite() {
        Set<String> companies = new HashSet<>() {{
            add("Facebook");
            add("Google");
        }};

        service.submit(() -> {
            readWriteLock.writeLock().lock();
            try {
                companies.add("Uber");
            } finally {
                readWriteLock.writeLock().unlock();
            }
        });

    }

    void testReadWrite2() {
        HashMap<String, String> companies = new HashMap<>() {{
            put("Facebook", "Facebook");
            put("Google", "Google");
        }};

        service.submit(() -> {
            readWriteLock.writeLock().lock();
            try {
                companies.get("Google");
            } finally {
                readWriteLock.writeLock().unlock();
            }
        });

    }

    public static void main(String[] args) throws InterruptedException {
        LockTypes lockTypes = new LockTypes();
        lockTypes.testReentrant();
        lockTypes.testReadWrite();
        lockTypes.testReadWrite2();
    }
}
