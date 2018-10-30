package com.bvan.oop.lessons7_8.hw.parser;

/**
 * @author bvanchuhov
 */
public class IllegalFirstNameException extends IllegalFullNameException {

    public IllegalFirstNameException() {
    }

    public IllegalFirstNameException(String message) {
        super(message);
    }

    public IllegalFirstNameException(String message, Throwable cause) {
        super(message, cause);
    }
}
