package com.spring.web.servlet.homework.repository;

import com.spring.web.servlet.homework.entity.Order;
import com.spring.web.servlet.homework.exception_handling.OrderNotFound;

import java.util.List;

public interface OrderRepository {

    Order getById(int id) throws OrderNotFound;

    List<Order> getAll();

    void add(Order order);
}
