package com.spring.web.servlet.homework.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Setter
@Getter
@ToString
public class Order {
    //@Getter
    private int id;
    //@Getter
    private LocalDate date;
    //@Getter
    private double cost;
    private List<Product> listOfProducts;
}
