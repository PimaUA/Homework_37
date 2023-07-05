package com.spring.web.servlet.homework.repository;

import com.spring.web.servlet.homework.entity.Order;
import com.spring.web.servlet.homework.entity.Product;
import com.spring.web.servlet.homework.exception_handling.OrderNotFound;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepositoryImpl implements OrderRepository{
    private static final Logger LOGGER = LogManager.getLogger();
    private List<Product> listOfProducts;
    private final ArrayList<Order> ordersList = new ArrayList<>();








    @Override
    public Order getById(int id) throws OrderNotFound {
        for (Order eachOrder : ordersList) {
            if (eachOrder.getId() == id) {
                return eachOrder;
            }
        }
        throw new OrderNotFound();//check
    }

    @Override
    public List<Order> getAll() {
        LOGGER.info("List of all orders " + ordersList.toString());
        return ordersList;
    }

    @Override
    public void add(Order order) {
        LOGGER.info(order + " have been added");
        ordersList.add(order);
    }
}
