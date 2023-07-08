package com.spring.web.servlet.homework.exception_handling;

public class OrderNotFoundException extends RuntimeException {

    public OrderNotFoundException() {
        super("The specified order does not exist");
    }
}
