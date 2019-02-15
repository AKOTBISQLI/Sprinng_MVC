package com.spring.practice.controller;

import com.spring.practice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index(Model m) {


        m.addAttribute("someAttribute", "someValue");
        System.out.println("fffffffffffffff");
        return "index";
    }
}
