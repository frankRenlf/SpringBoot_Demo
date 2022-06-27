package com.manageaccount.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.manageaccount.dao.UserDao;
import com.manageaccount.domain.User;
import com.manageaccount.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author : Frank.Ren
 * @version : 1.0
 * @Project : SpringBoot_Demo
 * @Package : com.manageaccount.service.Impl
 * @createTime : 2022/6/27 14:15
 * @Email : sc19lr@leeds.ac.uk
 * @github : https://github.com/frankRenlf?tab=overview&from=2022-04-01&to=2022-04-30
 * @Description :
 */
@Service
public class IUserServiceImpl extends ServiceImpl<UserDao, User> implements IUserService {
    @Autowired
    private UserDao userDao;

    @Override
    public Boolean check(User user) {
        return userDao.selectById(user.getId()).equals(user);
    }

}
