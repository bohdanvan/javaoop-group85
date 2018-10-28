package com.bvan.oop.lessons9_10.sorting;

import com.bvan.oop.lessons9_10.movie.Movie;
import com.bvan.oop.lessons9_10.movie.TestMovieFactory;

import java.util.Comparator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class SortingRunner {

    public static void main(String[] args) {
        List<Movie> movies = TestMovieFactory.createMovies();

        movies.sort(byReleaseYear().reversed()
                .thenComparing(byGenreCount())
                .thenComparing(byTitle()));

        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }

    public static Comparator<Movie> byTitle() {
        return new Comparator<Movie>() {
            @Override
            public int compare(Movie a, Movie b) {
                return a.getTitle().compareTo(b.getTitle());
            }
        };
    }

    public static Comparator<Movie> byGenreCount() {
        return new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return Integer.compare(o1.getGenres().size(), o2.getGenres().size());
            }
        };
    }

    public static Comparator<Movie> byReleaseYear() {
        return new ReleaseYearComparator();
    }
}

class ReleaseYearComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie a, Movie b) {
        return Integer.compare(a.getReleaseYear(), b.getReleaseYear());
    }
}
