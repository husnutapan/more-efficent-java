package com.asked.stackoverflow;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.function.Consumer;
import java.util.function.Supplier;

//https://stackoverflow.com/questions/180158/how-do-i-time-a-methods-execution-in-java
public class MethodExecutionTime {

    public static void main(String[] args) throws InterruptedException {
        //Traditional Way
        long start = System.currentTimeMillis();
        methodExecute();
        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println(duration);

        //Advance Way
        Supplier supplier = () -> {
            try {
                return methodExecuteWithReturn();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        };
        durationTime(System.out::println, supplier);
    }


    static void durationTime(Consumer<String> out, Supplier<String> returnVal) {
        LocalDateTime start = LocalDateTime.now();
        String response = returnVal.get();
        long duration = Duration.between(start, LocalDateTime.now()).toMillis();
        out.accept("advanced way result: " + String.valueOf(duration));
    }

    static void methodExecute() throws InterruptedException {
        Thread.sleep(1000);
    }

    static String methodExecuteWithReturn() throws InterruptedException {
        Thread.sleep(1000);
        return "return back";
    }


}
