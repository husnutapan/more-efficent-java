package com.java.efficent.countdownlatch.healthcheck;

import com.java.efficent.countdownlatch.healthcheck.microsevices.AccountServiceCheck;
import com.java.efficent.countdownlatch.healthcheck.microsevices.BaseCommon;
import com.java.efficent.countdownlatch.healthcheck.microsevices.EmployeeServiceCheck;
import com.java.efficent.countdownlatch.healthcheck.microsevices.ProviderServiceCheck;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchForHealthCheck {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);


        List<BaseCommon> serviceList = new ArrayList<>();
        serviceList.add(new AccountServiceCheck(countDownLatch));
        serviceList.add(new ProviderServiceCheck(countDownLatch));
        serviceList.add(new EmployeeServiceCheck(countDownLatch));


        serviceList.forEach(service -> new Thread(service).start());

        countDownLatch.await();

        System.out.println("Main thread execute here after ping to microservices.");
    }
}
