package io.dumerz.blogger.exception;

public class PostNotFoundException extends RuntimeException {

    static final long serialVersionUID = -6034797192743766228L;

    public PostNotFoundException(String message) {
        super(message);
    }
}