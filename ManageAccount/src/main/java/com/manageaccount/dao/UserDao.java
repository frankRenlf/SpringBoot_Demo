package com.manageaccount.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.manageaccount.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : SpringBoot_Demo
 * @Package : com.manageaccount.dao
 * @createTime : 2022/6/27 14:13
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */
@Mapper
public interface UserDao extends BaseMapper<User> {
}

