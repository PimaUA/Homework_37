package com.spring.web.servlet.homework.exception_handling;

public class OrderNotFound extends Exception{

    public OrderNotFound() {
        super("The specified order does not exist");
    }
}
