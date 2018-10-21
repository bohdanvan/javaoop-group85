package com.bvan.oop.lessons7_8.generic.box.good;

import com.bvan.oop.lessons5_6.format.oop.Formatter;
import com.bvan.oop.lessons7_8.generic.box.Cat;

/**
 * @author bvanchuhov
 */
public class Box<T> {
    // Box<T>
    // Box<T extends Cat>
    // Box<T extends Formatter>
    // Box<T extends Cat & Formatter>

    private final T value;

    public Box(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

//    public T create() {
//        return new T();
//    }

//    public T[] create() {
//        return (T[]) new Object[10];
//    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                '}';
    }
}
