package com.bvan.oop.lessons3_4;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class FinalExample {

    public static void main(String[] args) {
        final int x = 10;

        final ArrayList<String> names = new ArrayList<>();
//        names = new ArrayList<>();
        names.add("Taras");
    }

    public static void foo(final int a) {

    }
}
