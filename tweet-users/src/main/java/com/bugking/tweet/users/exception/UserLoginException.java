package com.bugking.tweet.users.exception;

public class UserLoginException extends RuntimeException{
    public UserLoginException(String message) {
        super(message);
    }
}
