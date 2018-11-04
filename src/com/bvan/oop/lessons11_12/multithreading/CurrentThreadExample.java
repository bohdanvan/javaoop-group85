package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class CurrentThreadExample {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                Thread currentThread = Thread.currentThread();
                System.out.println(currentThread.getName());
            }).start();
        }
    }
}
