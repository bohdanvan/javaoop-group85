package com.bvan.oop.lessons9_10.movie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.bvan.oop.lessons9_10.movie.Genre.*;

/**
 * @author bvanchuhov
 */
public class TestMovieFactory {

    public static List<Movie> createMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Venom", 2018, Arrays.asList(ACTION, SCI_FI)));
        movies.add(new Movie("The Green Mile", 1999, Arrays.asList(CRIME, DRAMA, FANTASY)));
        movies.add(new Movie("Fight Club", 1999, Arrays.asList(DRAMA)));
        movies.add(new Movie("Predator", 1987, Arrays.asList(ACTION, SCI_FI, THRILLER)));
        return movies;
    }
}
