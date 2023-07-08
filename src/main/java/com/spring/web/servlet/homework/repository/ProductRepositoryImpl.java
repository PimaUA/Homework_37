package com.spring.web.servlet.homework.repository;

import com.spring.web.servlet.homework.entity.Product;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
@Scope("prototype")
public class ProductRepositoryImpl implements ProductRepository {
    private List<Product> listOfProducts;

    @Override
    public void add(Product product) {
        listOfProducts.add(product);
    }

    public void createNewListOfProducts() {
        listOfProducts = new ArrayList<>();
    }

    public double getTotalCost() {
        double sumCost = 0;
        for (Product each : listOfProducts) {
            double eachCost = each.getCost();
            sumCost += eachCost;
        }
        return sumCost;
    }
}
