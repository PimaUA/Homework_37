package com.spring.web.servlet.homework.controller;

import com.spring.web.servlet.homework.entity.Order;
import com.spring.web.servlet.homework.entity.Product;
import com.spring.web.servlet.homework.exception_handling.OrderListNotFoundException;
import com.spring.web.servlet.homework.exception_handling.OrderNotFoundException;
import com.spring.web.servlet.homework.service.OrderService;
import com.spring.web.servlet.homework.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderService orderService;
    @Autowired
    ProductService productService;

    @RequestMapping("/welcome")
    public String showWelcomeView() {
        productService.createNewList();
        return "welcomeView";
    }

    @RequestMapping("/getAllOrders")
    public String showAllOrdersView(Model model) {
        List<Order> orderList;
        try {
            orderList = orderService.getAllOrders();
            model.addAttribute("orderList", orderList);
        } catch (OrderListNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "No orders available", e);
        }
        return "allOrdersView";
    }

    @RequestMapping("/addId")
    public String makeNewId() {
        return "idInputView";
    }

    @RequestMapping("/getOrderById")
    public String showGotOrderByIdView(@ModelAttribute("order")
                                       Order order, Model model) throws OrderNotFoundException {
        try {
            int id = order.getId();
            order = orderService.getOrderById(id);
            model.addAttribute(order);
        } catch (OrderNotFoundException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Order not found ", e);
        }
        return "foundByIdOrderView";
    }

    @RequestMapping("/saveOrder")
    public String saveOrder(Model model) {
        try {
            Order order = new Order();
            model.addAttribute("order", order);
            order.setId(orderService.incrementOrderId());
            order.setDate(LocalDate.now());
            order.setCost(productService.getTotalCost());
            orderService.addOrder(order);
        } catch (RuntimeException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Order not saved ", e);
        }
        return "congratulationView";
    }

    @RequestMapping("/addProduct")
    public String makeNewProduct(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "addProductView";
    }

    @RequestMapping("/saveProduct")
    public String saveProduct(@ModelAttribute("product") Product product) {
        try {
            productService.addProduct(product);
        } catch (RuntimeException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Product not saved ", e);
        }
        return "redirect:addProduct";
    }
}
