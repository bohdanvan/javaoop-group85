package com.bvan.oop.lessons9_10.treemap;

import com.bvan.oop.lessons9_10.movie.Movie;

import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

import static com.bvan.oop.lessons9_10.movie.Genre.*;
import static java.util.Arrays.asList;

/**
 * @author bvanchuhov
 */
public class TreeMapExample {

    public static void main(String[] args) {
        SortedMap<Integer, List<Movie>> yearToMovies = new TreeMap<>();

        yearToMovies.put(2013, asList(
                new Movie("Her", 2013, asList(ROMANCE, DRAMA, SCI_FI))
        ));
        yearToMovies.put(1994, asList(
                new Movie("Captain Fantastic", 1994, asList(DRAMA, ROMANCE, COMEDY)),
                new Movie("Pulp Fiction", 1994, asList(THRILLER, COMEDY, CRIME))
        ));
        yearToMovies.put(2000, asList(
                new Movie("A", 2000, asList(DRAMA, ROMANCE, COMEDY)),
                new Movie("B", 2000, asList(THRILLER, COMEDY, CRIME))
        ));

        SortedMap<Integer, List<Movie>> subMap = yearToMovies.subMap(1990, 2010);
        for (Map.Entry<Integer, List<Movie>> integerListEntry : subMap.entrySet()) {
            System.out.println(integerListEntry);
            System.out.println();
        }

    }
}
