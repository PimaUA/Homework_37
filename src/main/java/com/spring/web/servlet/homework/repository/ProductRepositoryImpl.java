package com.spring.web.servlet.homework.repository;

import com.spring.web.servlet.homework.entity.Product;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Repository
@Scope("prototype")
public class ProductRepositoryImpl implements ProductRepository{
    private static final Logger LOGGER = LogManager.getLogger();
    private List<Product> listOfProducts;
    //private List<Product> listOfProducts=new ArrayList<>();

     /*public void addProduct(Product product){
        LOGGER.info(product + " have been added");
        listOfProducts.add(product);
    }*/

    public void createNewListOfProducts(){
        listOfProducts=new ArrayList<>();
    }

    //@RequestMapping("/addProduct")
    @Override
    public void add(Product product) {
        LOGGER.info(product + " have been added");
        listOfProducts.add(product);
    }



    public double getTotalCost(){
        double sumCost=0;
for(Product each:listOfProducts){
    double eachCost=each.getCost();
    sumCost+=eachCost;
}
return sumCost;
}

}
