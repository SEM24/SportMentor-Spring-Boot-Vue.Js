package com.training.exception;

import org.springframework.http.HttpStatus;

// Specific exception types (optional)
public class ResourceNotFoundException extends ApiException {
    public ResourceNotFoundException(String message) {
        super(HttpStatus.NOT_FOUND, message);
    }
}
