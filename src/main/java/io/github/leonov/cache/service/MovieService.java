package io.github.leonov.cache.service;

import io.github.leonov.cache.model.dao.Movie;

import java.util.Optional;

public interface MovieService {
    Optional<Movie> findMovieByRank(int rank);
}
