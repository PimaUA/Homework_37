package com.spring.web.servlet.homework.service;

import com.spring.web.servlet.homework.entity.Order;
import com.spring.web.servlet.homework.exception_handling.OrderListNotFoundException;
import com.spring.web.servlet.homework.exception_handling.OrderNotFoundException;
import com.spring.web.servlet.homework.repository.OrderRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Scope("prototype")
public class OrderService {
    @Autowired
    OrderRepositoryImpl orderRepository;

    @Transactional
    public Order getOrderById(int id) {
        Order order = orderRepository.getById(id);
        if (order == null) {
            throw new OrderNotFoundException();
        }
        return order;
    }

    @Transactional
    public List<Order> getAllOrders() {
         List<Order> allOrders = orderRepository.getAll();
        if (allOrders == null) {
        throw new OrderListNotFoundException();
    }
        return allOrders;
    }

    @Transactional
    public void addOrder(Order order) {
        orderRepository.add(order);
    }

    @Transactional
    public int incrementOrderId() {
        return orderRepository.makeIdIncrement();
    }
}
