package com.java.efficent;

public class VolatileUseCase {

    static volatile int counter = 0;

    public static void main(String[] args) {
        new Listener().start();
        new Change().start();


    }

    static class Listener extends Thread {
        @Override
        public void run() {
            while (counter < 10) {
                System.out.println("Still less than ten now:" + counter);
            }
        }
    }

    static class Change extends Thread {
        @Override
        public void run() {
            while (counter < 10) {
                counter = ++counter;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}


