package io.github.leonov.cache.web.protocol.response.error;

import io.github.leonov.cache.web.protocol.response.Response;
import org.springframework.http.HttpStatus;

public class MovieNotFoundResponse extends Response {
    public MovieNotFoundResponse(String message) {
        super(HttpStatus.UNPROCESSABLE_ENTITY.value(), message);
    }
}
