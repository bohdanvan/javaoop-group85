package com.bvan.oop.lessons3_4.shape;

/**
 * @author bvanchuhov
 */
public class ShapeExample {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        Circle c = new Circle(10);

        double area1 = r.getArea();
        double area2 = c.getArea();

        Shape s = new Circle(10.0);

        Rectangle r2 = new Rectangle(10, 20);
        Shape s2 = r2;

        printShapeInfo(r2);
        printShapeInfo(new Circle(10));
    }

    private static void printShapeInfo(Shape s) {
        System.out.println("Area = " + s.getArea());
        System.out.println("Perimeter = " + s.getPerimeter());
    }

    private static void printRectangleInfo(Rectangle rectangle) {
        System.out.println("Area = " + rectangle.getArea());
        System.out.println("Perimeter = " + rectangle.getPerimeter());
    }

    private static void printCircleInfo(Circle circle) {
        System.out.println("Area = " + circle.getArea());
        System.out.println("Perimeter = " + circle.getPerimeter());
    }
}
