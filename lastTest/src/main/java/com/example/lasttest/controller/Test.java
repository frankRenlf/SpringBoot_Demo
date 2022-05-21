package com.example.lasttest.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/finalTest")
public class Test {

    @GetMapping
    public String Last() {
        return "holly shit";
    }

}
