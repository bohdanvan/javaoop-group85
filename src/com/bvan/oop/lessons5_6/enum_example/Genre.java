package com.bvan.oop.lessons5_6.enum_example;

/**
 * @author bvanchuhov
 */
public enum Genre {
    COMEDY(9, "0+"),
    DRAMA(6, "12+"),
    ACTION(8, "12+"),
    HORROR(7, "18+");

    private final int popularity;
    private final String minRating;

    Genre(int popularity, String minRating) {
        this.popularity = popularity;
        this.minRating = minRating;
    }

    public String getShortName() {
        return name().substring(0, 3).toLowerCase();
    }
}
