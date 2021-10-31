package com.Happiest;

public class CustomException extends Exception {
    String message;
    public AgeException ageException;

    CustomException(String message,AgeException type) {
        this.message=message;
        this.ageException=type;
    }

    enum AgeException {
        UNDERAGE;

    }
}
