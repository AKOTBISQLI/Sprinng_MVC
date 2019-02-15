package com.spring.practice.service;

import com.spring.practice.Model.MyProducts;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class ProductService {

    Map<String, MyProducts> myProductsMap=new HashMap<>();

    public Collection<MyProducts> addProduct(String name, int quantity, int price){
        myProductsMap.put(name,new MyProducts(name,quantity,price));
        return myProductsMap.values();
    }

}
