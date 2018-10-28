package com.bvan.oop.lessons9_10.java8;

import com.bvan.oop.lessons9_10.movie.Movie;
import com.bvan.oop.lessons9_10.movie.TestMovieFactory;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author bvanchuhov
 */
public class StreamApi {

    public static void main(String[] args) {
        List<Movie> movies = TestMovieFactory.createMovies();

        for (Movie movie : movies) {
            if (movie.getReleaseYear() < 2000) {
                String title = movie.getTitle();
                if (title.length() < 10) {
                    System.out.println(title);
                }
            }
        }
        System.out.println();

        List<String> collect = movies.stream()
                .filter(m -> m.getReleaseYear() < 2000)
                .map(m -> m.getTitle())
                .filter(t -> t.length() < 10)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
