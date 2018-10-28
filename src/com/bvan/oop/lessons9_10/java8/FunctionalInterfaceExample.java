package com.bvan.oop.lessons9_10.java8;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * @author bvanchuhov
 */
public class FunctionalInterfaceExample {

    public static void main(String[] args) {
        Function<String, Integer> len = s -> s.length();
        Predicate<String> startsWithHello = s -> s.startsWith("Hello");

        System.out.println(len.apply("Hello, Java"));
        System.out.println(startsWithHello.test("Hello, Java"));
    }
}
