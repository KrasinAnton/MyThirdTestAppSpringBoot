package ru.krasin.MyThirdTestAppSpringBoot.exception;

public class UnsupportedCodeException extends Exception {

    public UnsupportedCodeException() {
        super("Код '123' не поддерживается");
    }
}
