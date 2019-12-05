package com.ao.helloworldservice.domain;

import java.io.Serializable;

public class Hello implements Serializable {

    private String message;

    public Hello(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}