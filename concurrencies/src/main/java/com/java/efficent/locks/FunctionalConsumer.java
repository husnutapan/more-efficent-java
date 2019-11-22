package com.java.efficent.locks;

import java.util.concurrent.locks.ReentrantLock;

@FunctionalInterface
interface FunctionalConsumer {
    void consumeMe(ReentrantLock lock);
}
