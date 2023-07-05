package com.spring.web.servlet.homework.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Setter
@Getter
@ToString
//@Component
//@Scope("prototype")
public class Order {
    //@Getter
    private int id;
    //@Getter
    private LocalDate date;
    //@Getter
    private double cost;
    //private List<Product> listOfProducts;

   /* @PostConstruct
    public void init() {
        listOfProducts=new ArrayList<>();
    }*/
}
