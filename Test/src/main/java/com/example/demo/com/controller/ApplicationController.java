package com.example.demo.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    @GetMapping("/hello")
    public String getHelloMessGE(){
        return "HELLO AM RUNNING";
    }
}
