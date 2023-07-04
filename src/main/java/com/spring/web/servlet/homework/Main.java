package com.spring.web.servlet.homework;

import com.spring.web.servlet.homework.controller.OrderController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext
                = new AnnotationConfigApplicationContext("com.spring.web.servlet.homework");
        OrderController orderController = applicationContext.getBean(OrderController.class);


        applicationContext.close();

    }
}
