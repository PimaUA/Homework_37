package com.spring.web.servlet.homework.controller;

import com.spring.web.servlet.homework.entity.Product;
import com.spring.web.servlet.homework.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

public class ProductController {
@Autowired
    ProductService productService;


   /* @RequestMapping("/addProduct")
    public String makeNewProduct(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "addProductView";
    }

    @RequestMapping("/saveProduct")
    public String saveProduct(@ModelAttribute("product") Product product) {
        productService.addProduct(product);
        return "redirect:addProduct";
    }*/
}
