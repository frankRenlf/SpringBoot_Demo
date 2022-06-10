package com.demo_08_ssmp.service.impl;

import com.demo_08_ssmp.dao.BookDao;
import com.demo_08_ssmp.domain.Book;
import com.demo_08_ssmp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : SpringBoot_Demo
 * @Package : com.demo_08_ssmp.service.impl
 * @createTime : 2022/6/10 14:34
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public Boolean save(Book book) {
        return null;
    }

    @Override
    public Boolean update(Book book) {
        return null;
    }

    @Override
    public Boolean delete(Integer id) {
        return null;
    }

    @Override
    public Book getById(Integer id) {
        return null;
    }

    @Override
    public List<Book> getAll() {
        return null;
    }
}
