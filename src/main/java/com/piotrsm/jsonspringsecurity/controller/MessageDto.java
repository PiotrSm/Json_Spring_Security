package com.piotrsm.jsonspringsecurity.controller;

public class MessageDto {

    private String message;

    public MessageDto(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
