package com.bvan.oop.lessons3_4.shape;

/**
 * @author bvanchuhov
 */
public class Example {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        NameableShape nameableShape = rectangle;
        Shape shape = nameableShape;
        Nameable nameable = nameableShape;

        Shape y = new Circle(10);

        printCircle(new Rectangle(10, 20));
    }

    public static void printCircle(Shape s) { // BAD PRACTICE
        if (s instanceof Circle) { // BAD PRACTICE
            Circle c = (Circle) s;
            System.out.println("R = " + c.getRadius());
        }
    }

    public static void printInfo(NameableShape s) {
        System.out.println(s.getName() +
                ", S=" + s.getArea() +
                ", P=" + s.getPerimeter()
        );
    }
}
