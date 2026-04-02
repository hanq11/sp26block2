package com.example.tutorsof3062.exception;

import lombok.Getter;

@Getter
public class ApiException extends RuntimeException {
    private final String code;

    public ApiException(String message, String code) {
        super(message);
        this.code = code;
    }
}
