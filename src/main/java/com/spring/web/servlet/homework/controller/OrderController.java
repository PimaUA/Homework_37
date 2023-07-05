package com.spring.web.servlet.homework.controller;

import com.spring.web.servlet.homework.entity.Order;
import com.spring.web.servlet.homework.entity.Product;
import com.spring.web.servlet.homework.exception_handling.OrderNotFound;
import com.spring.web.servlet.homework.service.OrderService;
import com.spring.web.servlet.homework.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderService orderService;
    @Autowired
    ProductService productService;


    @RequestMapping("/reset")
    public String reset() {

        return "welcomeView";
    }


    @RequestMapping("/welcome")
    public String showFirstView() {
        productService.createNewList();
        return "welcomeView";
    }

    @RequestMapping("/allOrderView")
    public String showAllOrdersView(Model model) {
        List<Order> orderList = orderService.getAllOrders();
        model.addAttribute("orderList", orderList);
        return "allOrderView";
    }

    //?????
   /* @RequestMapping("/orderByIdView")
    public String showOrderByIdView(Model model) throws OrderNotFound {
        model.addAttribute("order",new Order());
        return "orderByIdView";
    }*/

    @RequestMapping("/addIdView")
    public String makeNewId() {
        return "orderByIdView";
    }

    @RequestMapping("/orderById")
    public String showGotOrderByIdView(@ModelAttribute("order") Order order, Model model) throws OrderNotFound {
        int id = order.getId();
        order = orderService.getOrderById(id);
        model.addAttribute(order);
        return "receivedByIdView";
    }


   /* @RequestMapping("/addOrder")
    public String makeNewOrder(Model model) {
        Order order = new Order();
        model.addAttribute("order", order);
        return "addedOrderView";
    }*/

    //@ModelAttribute("order")
    //@ModelAttribute("order")Order order
    @RequestMapping("/saveOrder")
    public String saveOrder(Model model) {
        Order order = new Order();
        model.addAttribute("order", order);
        order.setId(orderService.incrementOrderId(order));
        order.setDate(LocalDate.now());
        order.setCost(productService.getTotalCost());
        orderService.addOrder(order);

        return "congratulation";
    }


//to product controller
    @RequestMapping("/addProduct")
    public String makeNewProduct(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "addProductView";
    }

    @RequestMapping("/saveProduct")
    public String saveProduct(@ModelAttribute("product") Product product) {
        productService.addProduct(product);
        return "redirect:addProduct";
    }



   /* @RequestMapping(value="/getAll",method = RequestMethod.GET)
public String showOrders(){
        return "myView";
    }*/



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
