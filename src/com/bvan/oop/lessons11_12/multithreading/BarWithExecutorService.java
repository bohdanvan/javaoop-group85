package com.bvan.oop.lessons11_12.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author bvanchuhov
 */
public class BarWithExecutorService {

    public static void main(String[] args) {
        ThreadUtils.println("Bar is opened");

        int availableProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println(availableProcessors); // 8

        ExecutorService executorService =
                Executors.newFixedThreadPool(availableProcessors);
//                Executors.newSingleThreadExecutor();

        for (int drinkerId = 1; drinkerId <= 3; drinkerId++) {
            Runnable drinker = new Drinker(drinkerId);
            executorService.submit(drinker);
        }

//        executorService.shutdown();
        executorService.shutdownNow();

        try {
            executorService.awaitTermination(10, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        ThreadUtils.println("Bar is closed");
    }
}
