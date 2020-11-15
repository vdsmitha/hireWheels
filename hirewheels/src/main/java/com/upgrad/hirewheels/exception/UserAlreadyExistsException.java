package com.upgrad.hirewheels.exception;

public class UserAlreadyExistsException extends Exception {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}