package com.java.efficent.locks;

import java.util.concurrent.locks.ReentrantLock;

public abstract class Helper {
    public void testReentrant(ReentrantLock reentrantLock) {
        FunctionalConsumer functionalConsumer = (lock) -> {
            System.out.println("is locked:" + lock.isLocked());
            lock.lock();
            System.out.println("is locked:" + lock.isLocked());
            lock.unlock();
        };
        functionalConsumer.consumeMe(reentrantLock);
    }
}
