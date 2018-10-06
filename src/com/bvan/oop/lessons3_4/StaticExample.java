package com.bvan.oop.lessons3_4;

import com.bvan.oop.lessons3_4.shape.Rectangle;

/**
 * @author bvanchuhov
 */
public class StaticExample {

    public static double x; // BAD PRACTICE

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);

        double area1 = rectangle.getArea();
        double area2 = StaticExample.calculateArea(rectangle);

        int min = Math.min(10, 20);
        double pi = Math.PI;

        StaticExample.x = 10; // BAD PRACTICE
    }

    public static double calculateArea(Rectangle rectangle) {
        return rectangle.getWidth() * rectangle.getHeight();
    }
}
