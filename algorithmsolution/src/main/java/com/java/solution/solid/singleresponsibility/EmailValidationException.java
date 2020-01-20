package com.java.solution.solid.singleresponsibility;

public class EmailValidationException extends Exception {
    EmailValidationException(String reason) {
        super(reason);
    }
}
