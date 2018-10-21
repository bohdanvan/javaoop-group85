package com.bvan.oop.lessons7_8.wrapper;

/**
 * @author bvanchuhov
 */
public class IntegerPool {

    public static void main(String[] args) {
        Integer x1 = Integer.valueOf(100);
        Integer x2 = 100;

        Integer y1 = 200;
        Integer y2 = 200;

        System.out.println(x1 == x2); // true
        System.out.println(y1 == y2); // false

        System.out.println(x1.equals(x2)); // true
        System.out.println(y1.equals(y2)); // true
    }
}
