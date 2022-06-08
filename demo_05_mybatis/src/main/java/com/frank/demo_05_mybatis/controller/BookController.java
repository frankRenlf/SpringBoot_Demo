package com.frank.demo_05_mybatis.controller;
import com.frank.demo_05_mybatis.dao.BookDao;
import com.frank.demo_05_mybatis.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : SpringBoot_Demo
 * @Package : com.frank.demo_05_mybatis.controller
 * @createTime : 2022/6/8 20:52
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookDao bookDao;
    @GetMapping
    public Book test() {
        return bookDao.getById(2);
    }
}
