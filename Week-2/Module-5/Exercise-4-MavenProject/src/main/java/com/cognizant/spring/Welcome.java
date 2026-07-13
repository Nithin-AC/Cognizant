package com.cognizant.spring;

public class Welcome {

    private String message;

    public Welcome() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void display() {
        System.out.println(message);
    }
}