package com.bvan.oop.lessons3_4.shape;

/**
 * @author bvanchuhov
 */
public class EquilateralTriangle implements Shape {

    private final double side;

    public EquilateralTriangle(double side) {
        if (side < 0) {
            throw new IllegalArgumentException("negative side: " + side);
        }
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2) * Math.sqrt(3) / 4;
    }

    @Override
    public double getPerimeter() {
        return 3 * side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "EquilateralTriangle{" +
                "side=" + side +
                '}';
    }
}
