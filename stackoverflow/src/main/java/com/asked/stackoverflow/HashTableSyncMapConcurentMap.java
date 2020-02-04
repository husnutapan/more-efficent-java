package com.asked.stackoverflow;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//https://stackoverflow.com/questions/1291836/concurrenthashmap-vs-synchronized-hashmap
public class HashTableSyncMapConcurentMap {

    ExecutorService service = Executors.newFixedThreadPool(5);

    public static void main(String[] args) {
        HashTableSyncMapConcurentMap test = new HashTableSyncMapConcurentMap();
        Map<Integer, String> baseMap = new HashMap<>();
        for (int i = 0; i < 500000; i++) {
            baseMap.put(i, "i");
        }

        Map<Integer, String> hashTable = new Hashtable<>(baseMap);
        System.out.println(test.performanceTest(hashTable));
        Map<Integer, String> syncMap = Collections.synchronizedMap(new HashMap<>(baseMap));
        System.out.println(test.performanceTest(syncMap));
        Map<Integer, String> concurentMap = new ConcurrentHashMap<>(baseMap);
        System.out.println(test.performanceTest(concurentMap));

    }

     long performanceTest(Map<Integer, String> variousMap) {
        long startTime = System.nanoTime();

        for (int i = 0; i < 5; i++) {
            service.execute(new Runnable() {
                @Override
                public void run() {
                    for (int j = 0; j < 500000; j++) {
                        Integer random = (int) Math.ceil(Math.random() * 550000);
                        String value = variousMap.get(random);
                    }
                }
            });
        }
        return System.nanoTime() - startTime;
    }

}
