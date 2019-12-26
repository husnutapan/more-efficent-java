package com.java.efficent.semaphore;

import java.util.concurrent.Semaphore;

public class WebService implements Runnable {
    Semaphore semaphore = new Semaphore(3);

    @Override
    public void run() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " acquire locking...");
            Thread.sleep(1000);
            System.out.println("avaliable permit count:" + semaphore.availablePermits());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        semaphore.release();
    }
}
