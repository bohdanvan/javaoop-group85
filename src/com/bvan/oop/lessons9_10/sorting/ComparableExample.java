package com.bvan.oop.lessons9_10.sorting;

/**
 * @author bvanchuhov
 */
public class ComparableExample {

    public static void main(String[] args) {
        System.out.println("ABCD".compareTo("EFG")); // < 0
        System.out.println("Java".compareTo("Groovy")); // > 0
        System.out.println("Home".compareTo("Homework")); // < 0
        System.out.println("Home".compareToIgnoreCase("Home")); // 0
    }
}
