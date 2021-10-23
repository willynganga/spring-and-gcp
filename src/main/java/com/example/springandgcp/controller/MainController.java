package com.example.springandgcp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    

    @GetMapping("/")
    public String sayHello() {
        return "Hello from spring boot!";
    }

}
