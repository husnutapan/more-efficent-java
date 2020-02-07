package com.java.efficent.hashmap;

public class Test {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put(10);
        hashMap.put(36);
        hashMap.put(26);
        hashMap.put(12);
        hashMap.put(13);
        hashMap.put(52);
        hashMap.put(42);

        hashMap.delete(42);

        hashMap.printAll();
    }
}
