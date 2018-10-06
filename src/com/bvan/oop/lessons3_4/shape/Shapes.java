package com.bvan.oop.lessons3_4.shape;

import java.util.LinkedList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class Shapes {

    private final List<Shape> shapes = new LinkedList<>();

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public double getTotalArea() {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }

    @Override
    public String toString() {
        return "Shapes{" +
                "shapes=" + shapes +
                '}';
    }
}
