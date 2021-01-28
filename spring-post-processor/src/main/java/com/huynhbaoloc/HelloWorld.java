package com.huynhbaoloc;

public class HelloWorld {
    private String message;
    public void init(){
        System.out.println("Bean is going through init.");
    }
    public void destroy(){
        System.out.println("Bean is destroy now.");
    }
    public String getMessage() {
       return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
