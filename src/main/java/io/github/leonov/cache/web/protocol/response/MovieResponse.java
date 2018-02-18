package io.github.leonov.cache.web.protocol.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.github.leonov.cache.model.dao.Movie;
import io.github.leonov.cache.model.dao.Movie;

public class MovieResponse extends Response {
    @JsonProperty
    private final int rank;

    @JsonProperty
    private final String title;

    @JsonProperty
    private final int year;

    public MovieResponse(Movie movie) {
        this.rank = movie.getRank();
        this.title = movie.getTitle();
        this.year = movie.getYear();
    }
}
