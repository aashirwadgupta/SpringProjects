package com.aashirwad.springsecuritydemo.utils.exceptions;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String format, Object... arguments) {
        super(String.format(format, arguments));
    }
}
