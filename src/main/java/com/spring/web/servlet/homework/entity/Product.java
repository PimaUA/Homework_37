package com.spring.web.servlet.homework.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Product {
    private int id;
    private String name;
    private double cost;
}
