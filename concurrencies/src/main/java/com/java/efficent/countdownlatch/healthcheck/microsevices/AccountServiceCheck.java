package com.java.efficent.countdownlatch.healthcheck.microsevices;

import java.util.concurrent.CountDownLatch;

public class AccountServiceCheck extends BaseCommon {

    private CountDownLatch countDownLatch;

    public AccountServiceCheck(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }

    @Override
    public boolean verifyMicroService() throws InterruptedException {
        System.out.println("Pinging to account service...");
        Thread.sleep(10000);
        countDownLatch.countDown();
        return true;
    }
}
