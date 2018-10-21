package com.bvan.oop.lessons7_8.generic.formatter;

import com.bvan.oop.lessons5_6.format.Product;

/**
 * @author bvanchuhov
 */
public interface Formatter<T> {

    String format(T value);

    default void print(T value) {
        String s = format(value);
        System.out.println(s);
    }
}
