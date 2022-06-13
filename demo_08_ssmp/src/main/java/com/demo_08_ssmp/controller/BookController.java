package com.demo_08_ssmp.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.demo_08_ssmp.controller.utils.Result;
import com.demo_08_ssmp.domain.Book;
import com.demo_08_ssmp.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
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
    public Result getAll() {
        return new Result(true, iBookService.list());
    }

    @PostMapping
    public Result save(@RequestBody Book book) {
//        throw new IOException();
        return new Result(iBookService.save(book));
    }

    @PutMapping
    public Result update(@RequestBody Book book) {
        return new Result(iBookService.updateById(book));
    }

    @DeleteMapping("{id}")
    public Result delete(@PathVariable Integer id) {
        return new Result(iBookService.removeById(id));
    }

    @GetMapping("{id}")
    public Result getById(@PathVariable Integer id) {
        return new Result(true, iBookService.getById(id));
    }

    @GetMapping("substr/{str}")
    public Result getBy(@PathVariable String str) {
        return new Result(true, iBookService.getBy(str));
    }

    @GetMapping("{currentPage}/{pageSize}")
    public Result getPage(@PathVariable Integer currentPage, @PathVariable Integer pageSize) {
        return new Result(true, iBookService.getPage(currentPage, pageSize));
    }

}
