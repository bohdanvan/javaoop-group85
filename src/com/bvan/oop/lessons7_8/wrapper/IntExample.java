package com.bvan.oop.lessons7_8.wrapper;

/**
 * @author bvanchuhov
 */
public class IntExample {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = x + y;
        System.out.println(z); // 30

        // < Java 5
//        Integer a = Integer.valueOf(10);
//        Integer b = Integer.valueOf(20);
//        Integer c = Integer.valueOf(a.intValue() + b.intValue());
//        System.out.println(c); // 30

        // Java 5
        Integer a = 10; // autoboxing, int -> Integer
        Integer b = 20;
        Integer c = a + b;
        System.out.println(c); // 30
    }
}
