package com.example.demo.controller;

public class ErroreDTO {

    private String message;

    public ErroreDTO() {
    }

    public ErroreDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
