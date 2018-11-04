package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class Drinker implements Runnable {

    private final int id;

    public Drinker(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int beer = 1; beer <= 5; beer++) {
            ThreadUtils.println("I'm " + id + " drinker. " +
                    "I'm drinking " + beer + " beer");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                ThreadUtils.println("I'm " + id + " drinker. I was interrupted");
                return;
            }
        }
    }
}
