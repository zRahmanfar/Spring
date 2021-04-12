package com.example.demo.exeption;

public class Eception extends Exception {
    public Eception() {
        super();
    }

    public Eception(String message) {
        super(message);
    }

    public Eception(String message, Throwable cause) {
        super(message, cause);
    }

    public Eception(Throwable cause) {
        super(cause);
    }

    protected Eception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
