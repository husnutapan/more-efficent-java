package com.java.efficent.completable;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

public class CompletableDefinition {

    static void function1() throws InterruptedException {
        System.out.println("Thread started for function-1");
        Thread.sleep(1000);
        System.out.println("Thread finished execution for function-1");
    }


    static void function2() throws InterruptedException {
        System.out.println("Thread started for function-2");
        Thread.sleep(2000);
        System.out.println("Thread finished execution for function-2");
    }


    static void function3() throws InterruptedException {
        System.out.println("Thread started for function-3");
        Thread.sleep(500);
        System.out.println("Thread finished execution for function-3");
    }

    static void function4() throws InterruptedException {
        System.out.println("Thread started for function-4");
        Thread.sleep(1000);
        System.out.println("Thread finished execution for function-4");
    }

    static void functionForTimeout() throws InterruptedException {
        System.out.println("Timeout function started");
        Thread.sleep(5000);
    }

    public static void main(String[] args) {
        CompletableFuture<Void> async1 = CompletableFuture.runAsync(() -> {
            try {
                function1();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        CompletableFuture<Void> async2 = CompletableFuture.runAsync(() -> {
            try {
                function2();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        CompletableFuture<Void> asyncTimeout = CompletableFuture.runAsync(() -> {
            try {
                functionForTimeout();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Runnable runnable = () -> {
            try {
                function3();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable runnable1 = () -> {
            try {
                function4();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        CompletableFuture.allOf(async1, async2).thenRunAsync(runnable).thenRunAsync(runnable1).join();

        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Getting future value");
        try {
            System.out.println(future.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

        CompletableFuture.allOf(asyncTimeout).orTimeout(1, TimeUnit.SECONDS).join();



    }
}
