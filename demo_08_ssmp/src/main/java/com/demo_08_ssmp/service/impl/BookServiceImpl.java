package com.demo_08_ssmp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo_08_ssmp.dao.BookDao;
import com.demo_08_ssmp.domain.Book;
import com.demo_08_ssmp.service.IBookService;
import org.apache.logging.log4j.util.Strings;
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
 * @createTime : 2022/6/10 15:13
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */

@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> getBy(String str) {
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        lqw.like(str != null, Book::getName, str);
        return bookDao.selectList(lqw);
    }

    @Override
    public IPage<Book> getPage(Integer currentPage, Integer pageSize) {
        IPage<Book> iPage = new Page<>(currentPage, pageSize);
        bookDao.selectPage(iPage, null);
        return iPage;
    }

    @Override
    public IPage<Book> getPage(Integer currentPage, Integer pageSize, Book book) {

        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();

        lqw.like(Strings.isNotEmpty(book.getType()), Book::getType, book.getType());
        lqw.like(Strings.isNotEmpty(book.getName()), Book::getName, book.getName());
        lqw.like(Strings.isNotEmpty(book.getDescription()), Book::getDescription, book.getDescription());

        IPage<Book> iPage = new Page<>(currentPage, pageSize);
        bookDao.selectPage(iPage, lqw);
        return iPage;
    }

}
