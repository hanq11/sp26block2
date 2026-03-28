package com.example.sd20306sof3062.buoi2.exception;

public class ApiException extends RuntimeException {
    private final String code;

    public ApiException(String message, String code) {
        super(message);
        this.code = code;
    }
}