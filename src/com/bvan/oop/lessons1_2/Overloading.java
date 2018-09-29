package com.bvan.oop.lessons1_2;

/**
 * @author bvanchuhov
 */
public class Overloading {

    public static void main(String[] args) {
        System.out.println(sum(10.0, 20));

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return sum(a, b) + c;
    }

    public static double sum(double a, double b) {
        return a + b;
    }
}
