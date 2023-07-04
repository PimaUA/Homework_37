package com.spring.web.servlet.homework.controller;

import com.spring.web.servlet.homework.entity.Order;
import com.spring.web.servlet.homework.exception_handling.OrderIncorrectData;
import com.spring.web.servlet.homework.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderService orderService;


    @RequestMapping(value="/getAll",method = RequestMethod.GET)
public String showOrders(){
        return "myView";
    }



   /* @GetMapping("/getAll")
    public List<Order> showAllOrders() {
        List<Order> orderList;
        try {
            orderList = orderService.getAllOrders();
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No orders available ", e);
        }
        return orderList;
    }

    @GetMapping("/orders/{id}")
    public Order showOrderById(@PathVariable int id) {
        Order order;
        try {
            order = orderService.getOrderById(id);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Order not found ", e);
        }
        return order;
    }

    @PostMapping("/orders")
    public Order showAddedOrder(@RequestBody Order order) {
        try {
            orderService.addOrder(order);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Order not added ", e);
        }
        return order;
    }*/

    /*@ExceptionHandler
    public ResponseEntity<OrderIncorrectData> handleException(Exception exception) {
        OrderIncorrectData orderIncorrectData = new OrderIncorrectData();
        orderIncorrectData.setInfo(exception.getMessage());
        return new ResponseEntity<>(orderIncorrectData, HttpStatus.BAD_REQUEST);
    }*/
}
