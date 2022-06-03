package com.frank.demo_04_junit;

import com.frank.demo_04_junit.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo04JunitApplicationTests {

    // Test object
    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        // Test corresponding methods
        System.out.println("Test........");
        bookDao.save();
    }

}
