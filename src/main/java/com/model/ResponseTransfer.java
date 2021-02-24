package com.model;

public class ResponseTransfer {
    private String message;

    public ResponseTransfer(String message){
        this.message=message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
