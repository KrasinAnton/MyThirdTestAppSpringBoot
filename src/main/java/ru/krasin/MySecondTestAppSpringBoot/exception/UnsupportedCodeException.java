package ru.krasin.MySecondTestAppSpringBoot.exception;

public class UnsupportedCodeException extends RuntimeException {

    private final String errorCode;

    public UnsupportedCodeException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
