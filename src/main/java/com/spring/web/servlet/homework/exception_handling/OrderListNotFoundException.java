package com.spring.web.servlet.homework.exception_handling;

public class OrderListNotFoundException extends RuntimeException{

    public OrderListNotFoundException() {
        super("The specified list of orders does not exist");
    }
}
