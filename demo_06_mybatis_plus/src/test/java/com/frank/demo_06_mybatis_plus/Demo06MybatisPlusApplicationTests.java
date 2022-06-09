package com.frank.demo_06_mybatis_plus;

import com.frank.demo_06_mybatis_plus.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo06MybatisPlusApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        System.out.println(bookDao.selectById(2));
    }

    @Test
    void deleteById() {
        bookDao.deleteById(3);
//        System.out.println(bookDao.selectList(null));
    }

}
