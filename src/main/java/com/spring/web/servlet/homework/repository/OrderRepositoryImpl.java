package com.spring.web.servlet.homework.repository;

import com.spring.web.servlet.homework.entity.Order;
import com.spring.web.servlet.homework.entity.Product;
import com.spring.web.servlet.homework.exception_handling.OrderNotFound;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Repository
public class OrderRepositoryImpl implements OrderRepository{
    //@Autowired
    //private List<Product> listOfProducts=new ArrayList<>();
    private static final Logger LOGGER = LogManager.getLogger();
    private final ArrayList<Order> ordersList = new ArrayList<>();
    private final AtomicInteger idIncrementer=new AtomicInteger(1);

    public int incrementID(Order order){
        int id=order.getId();
        id=idIncrementer.getAndIncrement();
        return id;
    }

/*public double getTotalCost(){
        double sumCost=0;
for(Product each:listOfProducts){
    double eachCost=each.getCost();
    sumCost+=eachCost;
}
return sumCost;
}*/

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

    /*public void addProduct(Product product){
        LOGGER.info(product + " have been added");
        listOfProducts.add(product);
    }*/
}
