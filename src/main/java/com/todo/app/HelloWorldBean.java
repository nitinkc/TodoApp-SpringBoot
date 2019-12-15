package com.todo.app;

/**
 * Created by nichaurasia on Sunday, December/15/2019 at 2:38 AM
 */

public class HelloWorldBean {
    private String message;

    public HelloWorldBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
