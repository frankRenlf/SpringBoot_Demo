package com.demo_08_ssmp.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.demo_08_ssmp.dao.BookDao;
import com.demo_08_ssmp.domain.Book;
import com.demo_08_ssmp.service.IBookService;
import org.springframework.stereotype.Service;

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
}
