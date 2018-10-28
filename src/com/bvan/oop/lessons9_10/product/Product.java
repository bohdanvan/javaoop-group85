package com.bvan.oop.lessons9_10.product;

/**
 * @author bvanchuhov
 */
public class Product {

    private final String name;
    private final AverageRating rating = new AverageRating();

    public Product(String name) {
        this.name = name;
    }

    public void addMark(int mark) {
        rating.addMark(mark);
    }

    public double getRating() {
        return rating.getRating();
    }
}
