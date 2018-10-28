package com.bvan.oop.lessons9_10.product;

/**
 * @author bvanchuhov
 */
public class AverageRating {

    private int sum = 0;
    private int count = 0;

    public double getRating() {
        if (count == 0) {
            throw new IllegalStateException("No marks");
        }
        return (double) sum / count;
    }

    public void addMark(int mark) {
        sum += mark;
        count++;
    }
}
