package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class BarWithMultithreading {

    public static void main(String[] args) {
        ThreadUtils.println("Bar is opened");

        for (int drinkerId = 1; drinkerId <= 3; drinkerId++) {
            Runnable runnable = new Drinker(drinkerId);
            Thread drinkerThread = new Thread(runnable);
            drinkerThread.start();
        }

        ThreadUtils.println("Bar is closed");
    }
}
