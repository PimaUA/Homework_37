package com.spring.web.servlet.homework.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Setter
@Getter
@ToString
public class Order {
    private int id;
    private LocalDate date;
    private double cost;
}