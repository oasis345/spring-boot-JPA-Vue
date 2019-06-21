package com.bitcamp.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bitcamp.web.service.CustomerService;
/**
 * HomeController
 */
@Controller
public class HomeController {
    @Autowired CustomerService customerService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }
    
}