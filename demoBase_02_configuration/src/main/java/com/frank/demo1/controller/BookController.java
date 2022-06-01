package com.frank.demo1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : demo1
 * @Package : com.frank.demo1.controller
 * @createTime : 2022/5/27 12:01
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */

@RestController
@RequestMapping("/books")
public class BookController {

    @Value("${tmpDir}")
    private String var;

    @GetMapping
    public String getById() {

        return var;
    }
}
