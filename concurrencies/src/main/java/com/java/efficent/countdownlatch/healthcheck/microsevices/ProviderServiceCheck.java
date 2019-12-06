package com.java.efficent.countdownlatch.healthcheck.microsevices;

import java.util.concurrent.CountDownLatch;

public class ProviderServiceCheck extends BaseCommon {
    private CountDownLatch countDownLatch;

    public ProviderServiceCheck(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public boolean verifyMicroService() throws InterruptedException {
        System.out.println("Pinging to provider service...");
        Thread.sleep(10000);
        countDownLatch.countDown();
        return true;
    }
}
