package com.statistics.exception;

public class NoSuchScoreIDException extends InternalError {

    private static String MESSAGE = "There is no score of this ID. " +
                                    "Check record's ID one more time.";

    public NoSuchScoreIDException(String message) {
        super(message);
    }

    public static String message() {
        return MESSAGE;
    }

}
