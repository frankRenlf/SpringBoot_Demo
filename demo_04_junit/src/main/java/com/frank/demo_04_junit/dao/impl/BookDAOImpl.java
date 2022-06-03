package com.frank.demo_04_junit.dao.impl;

import com.frank.demo_04_junit.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : SpringBoot_Demo
 * @Package : com.frank.demo_04_junit.dao.impl
 * @createTime : 2022/6/3 16:11
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */

@Repository
public class BookDAOImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("Book dao is running.....");
    }
}
