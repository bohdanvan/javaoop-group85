package com.bvan.oop.lessons3_4;

import com.bvan.oop.lessons3_4.shape.Shape;

/**
 * @author bvanchuhov
 */
public class BindingExample {

    public static void main(String[] args) {

    }

    public static void foo(Shape s) {
        System.out.println(sum(10, 20)); // early binding
        System.out.println(s.getArea()); // late binding
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
