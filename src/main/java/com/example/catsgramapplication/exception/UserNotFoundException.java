package com.example.catsgramapplication.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message) {
        super(message);
    }
}
