package com.frank.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody
@RestController
@RequestMapping("/testS")

public class TestController {

    @GetMapping
    public String GetById() {
        //        System.out.println(s);
        return "SpringBoot is running";
    }

}
