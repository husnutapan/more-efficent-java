package com.java.efficent.hashmap;

public class HashMap {
    private int bucketSize;
    private LinkedList[] buckets;

    public HashMap() {
        //default hashmap bucketsize = 16
        this(16);
    }

    public HashMap(int bucketSize) {
        this.bucketSize = bucketSize;
        buckets = new LinkedList[bucketSize];
        for (int i = 0; i < bucketSize; i++) {
            buckets[i] = new LinkedList();
        }
    }

    public int hash(int key) {
        key = Math.abs(key);
        return key % bucketSize;
    }

    void put(int key) {
        int hash = hash(key);
        buckets[hash].put(key);
    }

    void delete(int key) {
        int hash = hash(key);
        buckets[hash].remove(key);
    }

    void printAll() {
        for (int i = 0; i < bucketSize; i++) {
            System.out.println("Bucket: " + i);
            buckets[i].print();
        }
    }
}
