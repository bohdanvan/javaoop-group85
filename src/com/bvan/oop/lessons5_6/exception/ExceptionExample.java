package com.bvan.oop.lessons5_6.exception;

import java.io.IOException;

/**
 * @author bvanchuhov
 */
public class ExceptionExample {

    public static void main(String[] args) {
        try {
            String res = foo();
            System.out.println(res);
        } catch (IOException e) {
            System.out.println("IO error: " + e.getMessage());
        } catch (NoMoneyException e) {
            System.out.println("Sorry, you have not enough money");
        } finally {
            System.out.println("Finally");
        }

        System.out.println("Bye");
    }

    public static String foo() throws IOException {
        bar();
        return "OK";
    }

    /**
     *
     * @throws NoMoneyException
     */
    public static void bar() throws IOException {
        throw new IllegalArgumentException();
//        throw new NoMoneyException();
//        throw new FileNotFoundException("Can't read from file");
    }
}
