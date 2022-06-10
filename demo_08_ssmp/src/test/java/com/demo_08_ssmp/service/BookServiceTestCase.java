package com.demo_08_ssmp.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.demo_08_ssmp.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : SpringBoot_Demo
 * @Package : com.demo_08_ssmp.service
 * @createTime : 2022/6/10 14:43
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */

@SpringBootTest
public class BookServiceTestCase {

    @Autowired
    private BookService bookService;

    @Test
    void testGetById() {
        System.out.println(bookService.getById(2));
    }

    @Test
    void testSave() {
        Book book = new Book("journal", "testService", "8848");
        bookService.save(book);
    }

    @Test
    void testUpdate() {
        Book book = new Book(16, "update", "test4", "8802");
        bookService.update(book);
    }

    @Test
    void testDelete() {
        bookService.delete(14);
    }

    @Test
    void testGetAll() {
        bookService.getAll();
    }

    @Test
    void testGetPage() {
        IPage<Book> iPage = bookService.getPage(1, 4);
        System.out.println(iPage.getPages());
        System.out.println(iPage.getCurrent());
        System.out.println(iPage.getRecords());
        System.out.println(iPage.getSize());
        System.out.println(iPage.getTotal());
    }


}
