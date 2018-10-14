package com.bvan.oop.lessons5_6.enum_example;

/**
 * @author bvanchuhov
 */
public class MovieRunner {

    public static void main(String[] args) {
        Movie movie = new Movie("Titanic", 1999, Genre.DRAMA);
        System.out.println(movie);
    }
}
