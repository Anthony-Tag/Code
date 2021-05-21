package com.app.model;

public class HelloLazy {
    private String message;

    public HelloLazy(){
        System.out.println("HelloLazy No param Constructor called");
    }

    public HelloLazy(String message) {
        System.out.println("HelloLazy PARAM constructor called with message = "+message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        System.out.println("HelloLazy Setter method was called with message = "+message);
        this.message = message;
    }
}

