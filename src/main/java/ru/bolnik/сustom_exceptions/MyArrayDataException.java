package ru.bolnik.сustom_exceptions;

public class MyArrayDataException extends NumberFormatException{
    public MyArrayDataException(String message) {
        super(message);
    }
}
