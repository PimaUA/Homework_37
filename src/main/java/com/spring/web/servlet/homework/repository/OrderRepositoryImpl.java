package com.spring.web.servlet.homework.repository;

import com.spring.web.servlet.homework.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class OrderRepositoryImpl implements OrderRepository {
    private final ArrayList<Order> ordersList = new ArrayList<>();
    private final AtomicInteger idIncrementer = new AtomicInteger(1);

    @Override
    public Order getById(int id) {
        for (Order eachOrder : ordersList) {
            if (eachOrder.getId() == id) {
                return eachOrder;
            }
        }
        return null;
    }

    @Override
    public List<Order> getAll() {
        return ordersList;
    }

    @Override
    public void add(Order order) {
        ordersList.add(order);
    }

    public int makeIdIncrement() {
        return idIncrementer.getAndIncrement();
    }
}
