package com.java.efficent.semaphore;

import java.util.concurrent.Semaphore;

public class Main {

    public static void main(String[] args) {
        WebService webService = new WebService();

        Thread webService1 = new Thread(webService);
        webService1.setName("T1");
        Thread webService2 = new Thread(webService);
        webService2.setName("T2");
        Thread webService3 = new Thread(webService);
        webService3.setName("T3");
        Thread webService4 = new Thread(webService);
        webService4.setName("T4");
        Thread webService5 = new Thread(webService);
        webService5.setName("T5");
        Thread webService6 = new Thread(webService);
        webService6.setName("T6");

        webService1.start();
        webService2.start();
        webService3.start();
        webService4.start();
        webService5.start();
        webService6.start();
    }
}
