package com.java.efficent.countdownlatch.healthcheck.microsevices;

public abstract class BaseCommon implements Runnable {

    @Override
    public void run() {
        try {
            verifyMicroService();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public abstract boolean verifyMicroService() throws InterruptedException;
}
