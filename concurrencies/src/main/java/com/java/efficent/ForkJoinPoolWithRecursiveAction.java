package com.java.efficent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class ForkJoinPoolWithRecursiveAction extends RecursiveAction {

    private String text = "";
    static final int threshold = 5;


    ForkJoinPoolWithRecursiveAction(String text) {
        this.text = text;
    }


    @Override
    protected void compute() {
        if (text.length() > threshold) {
            ForkJoinTask.invokeAll(generateSubTask());
        } else {
            try {
                handleSubTask(text);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private void handleSubTask(String text) throws InterruptedException {
        Thread.sleep(100);
        System.out.println(Thread.activeCount());
        String conclusion = text.toUpperCase();
        System.out.println("Result: " + conclusion + " Thread is :" + Thread.currentThread().getName());
    }

    private List<ForkJoinPoolWithRecursiveAction> generateSubTask() {
        List<ForkJoinPoolWithRecursiveAction> tasks = new ArrayList<>();
        String taskOne = text.substring(0, text.length() / 2);
        String taskTwo = text.substring(text.length() / 2, text.length());

        tasks.add(new ForkJoinPoolWithRecursiveAction(taskOne));
        tasks.add(new ForkJoinPoolWithRecursiveAction(taskTwo));
        return tasks;
    }

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool(5);
        ForkJoinPoolWithRecursiveAction forkJoinPoolWithRecursiveAction = new ForkJoinPoolWithRecursiveAction("Lorem Ipsum, dizgi ve baskı endüstrisinde kullanılan mıgır metinlerdir. Lorem Ipsum, adı bilinmeyen bir matbaacının bir hurufat numune kitabı oluşturmak üzere bir yazı galerisini alarak karıştırdığı 1500'lerden beri endüstri standardı sahte metinler olarak kullanılmıştır. Beşyüz yıl boyunca varlığını sürdürmekle kalmamış, aynı zamanda pek değişmeden elektronik dizgiye de sıçramıştır. 1960'larda Lorem Ipsum pasajları da içeren Letraset yapraklarının yayınlanması ile ve yakın zamanda Aldus PageMaker gibi Lorem Ipsum sürümleri içeren masaüstü yayıncılık yazılımları ile popüler olmuştur.");
        forkJoinPool.invoke(forkJoinPoolWithRecursiveAction);
    }
}
