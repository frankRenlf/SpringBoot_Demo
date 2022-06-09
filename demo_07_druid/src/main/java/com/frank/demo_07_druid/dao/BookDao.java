package com.frank.demo_07_druid.dao;

import com.frank.demo_07_druid.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : SpringBoot_Demo
 * @Package : com.frank.demo_05_mybatis.dao
 * @createTime : 2022/6/8 14:35
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */

@Mapper
public interface BookDao {
    @Select("select * from tbl_book where id = #{id}")
    public Book getById(Integer id);


    // wrong method
    @Delete("delete * from tbl_book where id = #{id}")
    public Book deleteById(Integer id);

}
