package com.demo_08_ssmp.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.demo_08_ssmp.domain.Book;
import com.demo_08_ssmp.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

//@RestController
//@RequestMapping("/books")
public class BookController2 {

    @Autowired
    private IBookService iBookService;

    @GetMapping
    public List<Book> getAll() {
        return iBookService.list();
    }

    @PostMapping
    public boolean save(@RequestBody Book book) {
        return iBookService.save(book);
    }

    @PutMapping
    public boolean update(@RequestBody Book book) {
        return iBookService.updateById(book);
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable Integer id) {
        return iBookService.removeById(id);
    }

    @GetMapping("{id}")
    public Book getById(@PathVariable Integer id) {
        return iBookService.getById(id);
    }

    @GetMapping("substr/{str}")
    public List<Book> getBy(@PathVariable String str) {
        return iBookService.getBy(str);
    }

    @GetMapping("{currentPage}/{pageSize}")
    public IPage<Book> getPage(@PathVariable Integer currentPage, @PathVariable Integer pageSize) {
        return iBookService.getPage(currentPage, pageSize);
    }

}
