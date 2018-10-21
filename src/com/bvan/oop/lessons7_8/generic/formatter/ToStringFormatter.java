package com.bvan.oop.lessons7_8.generic.formatter;

/**
 * @author bvanchuhov
 */
public class ToStringFormatter<T> implements Formatter<T> {

    @Override
    public String format(T value) {
        return value.toString();
    }
}
