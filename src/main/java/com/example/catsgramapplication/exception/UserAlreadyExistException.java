package com.example.catsgramapplication.exception;

public class UserAlreadyExistException extends RuntimeException {
    public UserAlreadyExistException(String message) {
        super(message);
    }
}
