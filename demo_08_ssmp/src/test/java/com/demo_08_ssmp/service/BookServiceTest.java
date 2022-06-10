package com.demo_08_ssmp.service;

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
public class BookServiceTest {

    @Autowired
    private IBookService iBookService;

    @Test
    void testGetById() {
        System.out.println(iBookService.getById(2));
    }

    @Test
    void testSave() {
        Book book = new Book("IServiceTest", "byNow", "0012");
        iBookService.save(book);
    }

    @Test
    void testUpdate() {
        Book book = new Book(15, "update", "test4", "8802");
        iBookService.updateById(book);
    }

    @Test
    void testDelete() {
        iBookService.removeById(16);
    }

    @Test
    void testGetAll() {
        iBookService.list();
    }

    @Test
    void testGetPage() {
        IPage<Book> iPage = new Page<>(1, 4);
        iBookService.page(iPage);
        System.out.println(iPage.getPages());
        System.out.println(iPage.getCurrent());
        System.out.println(iPage.getRecords());
        System.out.println(iPage.getSize());
        System.out.println(iPage.getTotal());
    }


}
