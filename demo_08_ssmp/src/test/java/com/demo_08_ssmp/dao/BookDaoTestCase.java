package com.demo_08_ssmp.dao;

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
    }

    @Test
    void testGetBy() {
    }
}
