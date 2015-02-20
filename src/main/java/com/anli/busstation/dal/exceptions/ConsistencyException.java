package com.anli.busstation.dal.exceptions;

public class ConsistencyException extends RuntimeException {

    public ConsistencyException() {
        super();
    }

    public ConsistencyException(Throwable cause) {
        super(cause);
    }

    public ConsistencyException(String message) {
        super(message);
    }

    public ConsistencyException(String message, Throwable cause) {
        super(message, cause);
    }
}
