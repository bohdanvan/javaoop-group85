package com.bvan.oop.lessons9_10.filtering;

import com.bvan.oop.lessons9_10.movie.Movie;
import com.bvan.oop.lessons9_10.movie.TestMovieFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author bvanchuhov
 */
public class PredicateExample {

    public static void main(String[] args) {
        List<Movie> movies = TestMovieFactory.createMovies();

        List<Movie> filtered = filterJava8(movies, new ReleaseYearPredicate());
        for (Movie movie : filtered) {
            System.out.println(movie);
        }
    }

    public static List<Movie> filterJava8(List<Movie> movies, Predicate<Movie> predicate) {
        return movies.stream()
                .filter(predicate)
                .collect(Collectors.toList());
    }

    public static List<Movie> filter(List<Movie> movies, Predicate<Movie> predicate) {
        List<Movie> res = new ArrayList<>();
        for (Movie movie : movies) {
            if (predicate.test(movie)) {
                res.add(movie);
            }
        }
        return res;
    }
}

class ReleaseYearPredicate implements Predicate<Movie> {

    @Override
    public boolean test(Movie movie) {
        return movie.getReleaseYear() == 1999;
    }
}
