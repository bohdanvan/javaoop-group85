package com.bvan.oop.lessons9_10.movie;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * @author bvanchuhov
 */
public class Movie {

    private final String title;
    private final int releaseYear;
    private final Set<Genre> genres;

    public Movie(String title, int releaseYear, List<Genre> genres) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genres = new LinkedHashSet<>(genres);
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public Set<Genre> getGenres() {
        return Collections.unmodifiableSet(genres);
//        return new LinkedHashSet<>(genres);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", genres=" + genres +
                '}';
    }
}
