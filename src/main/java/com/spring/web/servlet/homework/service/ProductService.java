package com.spring.web.servlet.homework.service;

import com.spring.web.servlet.homework.entity.Product;
import com.spring.web.servlet.homework.repository.OrderRepositoryImpl;
import com.spring.web.servlet.homework.repository.ProductRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Scope("prototype")
public class ProductService {
    @Autowired
    ProductRepositoryImpl productRepository;

     @Transactional
    public void addProduct(Product product){
        productRepository.add(product);
    }

     @Transactional
   public double getTotalCost(){
       return productRepository.getTotalCost();
   }

   @Transactional
   public void createNewList(){
       productRepository.createNewListOfProducts();
   }
}
