package com.andriihlianko.testproject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class IncorrectDataException extends RuntimeException {
    public IncorrectDataException() {
    }
    public IncorrectDataException(String message) {
        super(message);
    }
}
