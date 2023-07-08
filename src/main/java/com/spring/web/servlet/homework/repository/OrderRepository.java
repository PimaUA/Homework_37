package com.spring.web.servlet.homework.repository;

import com.spring.web.servlet.homework.entity.Order;
import com.spring.web.servlet.homework.exception_handling.OrderNotFoundException;

import java.util.List;

public interface OrderRepository {

    Order getById(int id) throws OrderNotFoundException;

    List<Order> getAll();

    void add(Order order);
}
