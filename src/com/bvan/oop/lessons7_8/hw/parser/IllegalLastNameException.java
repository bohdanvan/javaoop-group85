package com.bvan.oop.lessons7_8.hw.parser;

/**
 * @author bvanchuhov
 */
public class IllegalLastNameException extends IllegalFullNameException {

    public IllegalLastNameException() {
    }

    public IllegalLastNameException(String message) {
        super(message);
    }

    public IllegalLastNameException(String message, Throwable cause) {
        super(message, cause);
    }
}
