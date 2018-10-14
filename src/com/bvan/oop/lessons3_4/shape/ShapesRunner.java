package com.bvan.oop.lessons3_4.shape;

/**
 * @author bvanchuhov
 */
public class ShapesRunner {

    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        shapes.add(new Rectangle(10, 20));
        shapes.add(new Circle(10));
        shapes.add(new EquilateralTriangle(10));
        shapes.add(new Square(10));

        double totalArea = shapes.getTotalArea();
        System.out.println("totalArea = " + totalArea);
    }
}
