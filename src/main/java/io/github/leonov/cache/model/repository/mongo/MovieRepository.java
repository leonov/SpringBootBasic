package io.github.leonov.cache.model.repository.mongo;

import io.github.leonov.cache.model.dao.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;


public interface MovieRepository extends MongoRepository<Movie, String> {
    Optional<Movie> findOneByRank(int rank);
}
