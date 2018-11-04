package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class BarWithoutMultithreading {

    public static void main(String[] args) {
        ThreadUtils.println("Bar is opened");

        Drinker d1 = new Drinker(1);
        d1.run();

        Drinker d2 = new Drinker(2);
        d2.run();

        ThreadUtils.println("Bar is closed");
    }
}
