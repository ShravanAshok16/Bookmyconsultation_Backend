package com.upgrad.bookmyconsultation.exception;

public class ResourceUnAvailableException extends RuntimeException{
    public ResourceUnAvailableException(String msg) {
        super(msg);
    }

    public ResourceUnAvailableException() {

    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
