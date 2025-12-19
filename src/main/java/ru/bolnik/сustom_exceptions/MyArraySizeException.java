package ru.bolnik.сustom_exceptions;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException(String message) {
        super(message);
    }
}
