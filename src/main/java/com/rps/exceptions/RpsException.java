package com.rps.exceptions;

public class RpsException extends Exception {

    public String getMessage() {
        String message = "Insert correct key";
        return message;
    }
}
