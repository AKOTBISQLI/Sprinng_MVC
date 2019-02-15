package com.spring.practice.controller;

import com.spring.practice.Model.MyProducts;
import com.spring.practice.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;

@Controller
public class ProductController {
    @RequestMapping("/test")
    public String testadd(@RequestParam("name") String name,@RequestParam("quantity") int quantity,@RequestParam("price") int price, Model m) {
        ProductService productService=new ProductService();
        Collection<MyProducts> myProducts=productService.addProduct(name,quantity,price);
        m.addAttribute("Product", myProducts.toString());
        System.out.println("fffffffffffffff");
        return "test";
    }


}
