package com.mathiassammer.dscrudclientes.services.exceptions;

public class DatabaseException extends RuntimeException {

    public DatabaseException(String message) {
        super(message);
    }
}
