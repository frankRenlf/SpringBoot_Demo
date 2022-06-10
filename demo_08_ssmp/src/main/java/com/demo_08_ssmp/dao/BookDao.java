package com.demo_08_ssmp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo_08_ssmp.domain.Book;
import org.apache.ibatis.annotations.Mapper;


/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : SpringBoot_Demo
 * @Package : com.demo_08_ssmp.dao
 * @createTime : 2022/6/9 17:19
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {

}
