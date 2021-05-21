package com.app.model;
public class Hello {

    private String message;

    public Hello(){
        System.out.println("no param Constructor called");
    }

    public Hello(String message){
        System.out.println("PARAM constructor called with message = "+ message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        System.out.println("Setter method was called with messsage = "+message);
        this.message = message;
    }
}
