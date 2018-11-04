package com.bvan.oop.lessons11_12.multithreading.interruption;

import com.bvan.oop.lessons11_12.multithreading.ThreadUtils;

/**
 * @author bvanchuhov
 */
public class FactorialRunner {

    public static void main(String[] args) {
        Thread thread = new Thread(new FactorialTask(1_000_000));
        thread.start();

        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread.interrupt();

        ThreadUtils.println("Main is finished");
    }
}
