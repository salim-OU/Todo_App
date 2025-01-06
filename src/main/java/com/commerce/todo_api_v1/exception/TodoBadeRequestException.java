package com.commerce.todo_api_v1.exception;

public class TodoBadeRequestException extends RuntimeException{
    public TodoBadeRequestException(String message){
        super(message);
    }
}
