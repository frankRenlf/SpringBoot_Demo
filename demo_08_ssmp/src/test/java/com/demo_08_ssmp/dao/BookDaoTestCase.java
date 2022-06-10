package com.demo_08_ssmp.dao;

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
 * @Package : com.demo_08_ssmp.dao
 * @createTime : 2022/6/9 17:22
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */

@SpringBootTest
public class BookDaoTestCase {
    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        bookDao.selectById(2);
    }

    @Test
    void testSave() {
        Book book = new Book("science", "test2", "156");
        bookDao.insert(book);
    }

    @Test
    void testUpdate() {
        Book book = new Book(14, "novel", "test3", "null");
        bookDao.updateById(book);
    }

    @Test
    void testDelete() {
        bookDao.deleteById(14);
    }

    @Test
    void testGetAll() {
        bookDao.selectList(null);
    }

    @Test
    void testGetPage() {
        IPage<Book> iPage = new Page<>(2, 5);
        bookDao.selectPage(iPage, null);
        System.out.println(iPage.getPages());
        System.out.println(iPage.getCurrent());
        System.out.println(iPage.getRecords());
        System.out.println(iPage.getSize());
        System.out.println(iPage.getTotal());

    }

    @Test
    void testGetBy() {
        QueryWrapper<Book> qw = new QueryWrapper<>();
        qw.like("name", "spring");
        bookDao.selectList(qw);
    }

    @Test
    void testGetBy2() {
        String name = "1";
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        lqw.like(name != null, Book::getName, name);
        bookDao.selectList(lqw);
    }

}
