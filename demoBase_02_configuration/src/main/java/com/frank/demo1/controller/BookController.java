package com.frank.demo1.controller;

import com.frank.demo1.MyDtaSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

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

    /**
     * @Value("${tmpDir}") private String var;
     */

    @Autowired
    private Environment env;


    @Autowired
    private MyDtaSource myDtaSource;

    @GetMapping
    public String getById() {

        System.out.println(myDtaSource);
//        return env.getProperty("users[1].age");
        return Arrays.toString(new MyDtaSource[]{myDtaSource});
    }
}
