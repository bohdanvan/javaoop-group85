package com.bvan.oop.lessons9_10.java8;

/**
 * @author bvanchuhov
 */
public class OperatorExample {

    public static void main(String[] args) {
        Operator sum1 = (x, y) -> x + y;
        Operator sum2 = (int x, int y) -> x + y;
        Operator sum3 = (int x, int y) -> {
            return x + y;
        };

        System.out.println(sum1.apply(10, 20));
    }
}
