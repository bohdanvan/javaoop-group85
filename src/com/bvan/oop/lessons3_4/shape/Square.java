package com.bvan.oop.lessons3_4.shape;

/**
 * @author bvanchuhov
 */
public class Square implements Shape {

    private final double side;

    public Square(double side) {
        if (side < 0) {
            throw new IllegalArgumentException("negative side: " + side);
        }
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}
