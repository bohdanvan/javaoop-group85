package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class BarPractice {

    public static void main(String[] args) {
        ThreadUtils.println("Bar is opened");

        new Thread(() -> {
            new Drinker(1).run();
            new Drinker(2).run();
        }).start();

        new Thread(() -> {
            new Drinker(3).run();
            new Drinker(4).run();
        }).start();

        ThreadUtils.println("Bar is closed");
    }
}
