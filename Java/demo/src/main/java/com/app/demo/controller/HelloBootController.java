package com.app.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBootController {

    @GetMapping("/")
    public String helloGet(){
        return "Hello Server";
    }
}
