package com.bvan.oop.lessons7_8.hw.parser;

/**
 * @author bvanchuhov
 */
public class Runner {

    public static void main(String[] args) {
        FullNameConsoleReader reader = new FullNameConsoleReaderImpl();
        FullName fullName = reader.read();
        System.out.println(fullName);
    }
}
