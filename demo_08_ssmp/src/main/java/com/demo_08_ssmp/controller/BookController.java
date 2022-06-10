package com.demo_08_ssmp.controller;

import com.baomidou.mybatisplus.extension.service.IService;
import com.demo_08_ssmp.domain.Book;
import com.demo_08_ssmp.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : SpringBoot_Demo
 * @Package : com.demo_08_ssmp.controller
 * @createTime : 2022/6/10 15:38
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService iBookService;

    @GetMapping
    public List<Book> getAll() {
        return iBookService.list();
    }

}
