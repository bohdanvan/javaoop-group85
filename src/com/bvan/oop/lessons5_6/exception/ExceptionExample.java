package com.bvan.oop.lessons5_6.exception;

/**
 * @author bvanchuhov
 */
public class ExceptionExample {

    public static void main(String[] args) {
        try {
            String res = foo();
            System.out.println(res);
        } catch (RuntimeException e) {
            System.out.println("Sorry, error: " + e.getMessage());
        }
        System.out.println("Bye");
    }

    public static String foo() {
        bar();
        return "OK";
    }

    public static void bar() {
        throw new IllegalArgumentException();
    }
}
