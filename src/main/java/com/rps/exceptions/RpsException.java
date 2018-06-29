package com.rps.exceptions;

public class RpsException extends NumberFormatException {

    public String getMessage() {
        String message = "Insert correct key";
        return message;
    }
}
