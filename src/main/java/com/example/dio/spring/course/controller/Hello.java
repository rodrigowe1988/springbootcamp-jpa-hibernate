package com.example.dio.spring.course.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/")
    public String helloMessage() {
        return "hello there, I'm using spring boot";
    }
}
