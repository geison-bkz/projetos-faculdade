package com.automatosfinitos.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ExemploController {


    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }
}
